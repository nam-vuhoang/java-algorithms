"use strict";(globalThis.webpackChunkcodility=globalThis.webpackChunkcodility||[]).push([[84910],{84910:(e,t,n)=>{n.d(t,{MT:()=>g,bO:()=>T,kc:()=>_});var r=n(67294),o=n(86010);const c="undefined"!=typeof document?r.useLayoutEffect:()=>{};let i=new Map;function u(e,t){if(e===t)return e;let n=i.get(e);if(n)return n(t),t;let r=i.get(t);return r?(r(e),e):t}function l(...e){return(...t)=>{for(let n of e)"function"==typeof n&&n(...t)}}function d(...e){let t={...e[0]};for(let n=1;n<e.length;n++){let r=e[n];for(let e in r){let n=t[e],c=r[e];"function"==typeof n&&"function"==typeof c&&"o"===e[0]&&"n"===e[1]&&e.charCodeAt(2)>=65&&e.charCodeAt(2)<=90?t[e]=l(n,c):"className"!==e&&"UNSAFE_className"!==e||"string"!=typeof n||"string"!=typeof c?"id"===e&&n&&c?t.id=u(n,c):t[e]=void 0!==c?c:n:t[e]=(0,o.default)(n,c)}}return t}function a(e){if(function(){if(null==s){s=!1;try{document.createElement("div").focus({get preventScroll(){return s=!0,!0}})}catch(e){}}return s}())e.focus({preventScroll:!0});else{let t=function(e){for(var t=e.parentNode,n=[],r=document.scrollingElement||document.documentElement;t instanceof HTMLElement&&t!==r;)(t.offsetHeight<t.scrollHeight||t.offsetWidth<t.scrollWidth)&&n.push({element:t,scrollTop:t.scrollTop,scrollLeft:t.scrollLeft}),t=t.parentNode;return r instanceof HTMLElement&&n.push({element:r,scrollTop:r.scrollTop,scrollLeft:r.scrollLeft}),n}(e);e.focus(),function(e){for(let{element:t,scrollTop:n,scrollLeft:r}of e)t.scrollTop=n,t.scrollLeft=r}(t)}}new Set(["id"]),new Set(["aria-label","aria-labelledby","aria-describedby","aria-details"]);let s=null,f=new Map,m=new Set;function p(){if("undefined"==typeof window)return;let e=t=>{let n=f.get(t.target);if(n&&(n.delete(t.propertyName),0===n.size&&(t.target.removeEventListener("transitioncancel",e),f.delete(t.target)),0===f.size)){for(let e of m)e();m.clear()}};document.body.addEventListener("transitionrun",(t=>{let n=f.get(t.target);n||(n=new Set,f.set(t.target,n),t.target.addEventListener("transitioncancel",e)),n.add(t.propertyName)})),document.body.addEventListener("transitionend",e)}"undefined"!=typeof document&&("loading"!==document.readyState?p():document.addEventListener("DOMContentLoaded",p)),"undefined"!=typeof document&&window.visualViewport,new Map;var v=n(9621);function b(e){if("virtual"===(0,v.Jz)()){let n=document.activeElement;t=()=>{document.activeElement===n&&document.contains(e)&&a(e)},requestAnimationFrame((()=>{0===f.size?t():m.add(t)}))}else a(e);var t}function h(e,t){return"#comment"!==e.nodeName&&function(e){if(!(e instanceof HTMLElement||e instanceof SVGElement))return!1;let{display:t,visibility:n}=e.style,r="none"!==t&&"hidden"!==n&&"collapse"!==n;if(r){const{getComputedStyle:t}=e.ownerDocument.defaultView;let{display:n,visibility:o}=t(e);r="none"!==n&&"hidden"!==o&&"collapse"!==o}return r}(e)&&function(e,t){return!e.hasAttribute("hidden")&&("DETAILS"!==e.nodeName||!t||"SUMMARY"===t.nodeName||e.hasAttribute("open"))}(e,t)&&(!e.parentElement||h(e.parentElement,e))}const E=r.createContext(null);let N=null;function g(e){let{children:t,contain:n,restoreFocus:o,autoFocus:i}=e,u=(0,r.useRef)(),l=(0,r.useRef)(),d=(0,r.useRef)([]),{parentNode:a}=(0,r.useContext)(E)||{},s=(0,r.useMemo)((()=>new P({scopeRef:d})),[d]);c((()=>{let e=a||D.root;if(D.getTreeNode(e.scopeRef)&&N&&!F(N,e.scopeRef)){let t=D.getTreeNode(N);t&&(e=t)}e.addChild(s),D.addNode(s)}),[s,a]),c((()=>{D.getTreeNode(d).contain=n}),[n]),c((()=>{let e=u.current.nextSibling,t=[];for(;e&&e!==l.current;)t.push(e),e=e.nextSibling;d.current=t}),[t]),function(e,t,n){c((()=>{if(t||n)return;let r=e.current,o=t=>{let n=t.target;S(n,e.current)?N=e:M(n)||(N=null)};return document.addEventListener("focusin",o,!1),r.forEach((e=>e.addEventListener("focusin",o,!1))),()=>{document.removeEventListener("focusin",o,!1),r.forEach((e=>e.removeEventListener("focusin",o,!1)))}}),[e,t,n])}(d,o,n),function(e,t){let n=(0,r.useRef)(),o=(0,r.useRef)(null);c((()=>{let r=e.current;if(!t)return void(o.current&&(cancelAnimationFrame(o.current),o.current=null));let c=t=>{if("Tab"!==t.key||t.altKey||t.ctrlKey||t.metaKey||!x(e))return;let n=document.activeElement,r=e.current;if(!S(n,r))return;let o=k(w(r),{tabbable:!0},r);o.currentNode=n;let c=t.shiftKey?o.previousNode():o.nextNode();c||(o.currentNode=t.shiftKey?r[r.length-1].nextElementSibling:r[0].previousElementSibling,c=t.shiftKey?o.previousNode():o.nextNode()),t.preventDefault(),c&&A(c,!0)},i=t=>{N&&!F(N,e)||!S(t.target,e.current)?x(e)&&!C(t.target,e)?n.current?n.current.focus():N&&K(N.current):x(e)&&(n.current=t.target):(N=e,n.current=t.target)},u=t=>{o.current&&cancelAnimationFrame(o.current),o.current=requestAnimationFrame((()=>{x(e)&&!C(document.activeElement,e)&&(N=e,document.body.contains(t.target)?(n.current=t.target,n.current.focus()):N&&K(N.current))}))};return document.addEventListener("keydown",c,!1),document.addEventListener("focusin",i,!1),r.forEach((e=>e.addEventListener("focusin",i,!1))),r.forEach((e=>e.addEventListener("focusout",u,!1))),()=>{document.removeEventListener("keydown",c,!1),document.removeEventListener("focusin",i,!1),r.forEach((e=>e.removeEventListener("focusin",i,!1))),r.forEach((e=>e.removeEventListener("focusout",u,!1)))}}),[e,t]),c((()=>()=>{o.current&&cancelAnimationFrame(o.current)}),[o])}(d,n),function(e,t,n){const o=(0,r.useRef)("undefined"!=typeof document?document.activeElement:null);c((()=>{let r=e.current;if(!t||n)return;let o=()=>{N&&!F(N,e)||!S(document.activeElement,e.current)||(N=e)};return document.addEventListener("focusin",o,!1),r.forEach((e=>e.addEventListener("focusin",o,!1))),()=>{document.removeEventListener("focusin",o,!1),r.forEach((e=>e.removeEventListener("focusin",o,!1)))}}),[e,n]),c((()=>{if(!t)return;let r=t=>{if("Tab"!==t.key||t.altKey||t.ctrlKey||t.metaKey||!x(e))return;let n=document.activeElement;if(!S(n,e.current))return;let r=D.getTreeNode(e).nodeToRestore,o=k(document.body,{tabbable:!0});o.currentNode=n;let c=t.shiftKey?o.previousNode():o.nextNode();if(document.body.contains(r)&&r!==document.body||(r=null,D.getTreeNode(e).nodeToRestore=null),(!c||!S(c,e.current))&&r){o.currentNode=r;do{c=t.shiftKey?o.previousNode():o.nextNode()}while(S(c,e.current));t.preventDefault(),t.stopPropagation(),c?A(c,!0):M(r)?A(r,!0):n.blur()}};return n||document.addEventListener("keydown",r,!0),()=>{n||document.removeEventListener("keydown",r,!0)}}),[e,t,n]),c((()=>{if(t)return D.getTreeNode(e).nodeToRestore=o.current,()=>{let n=D.getTreeNode(e).nodeToRestore;if(t&&n&&(S(document.activeElement,e.current)||document.activeElement===document.body&&function(e){let t=D.getTreeNode(N);for(;t&&t.scopeRef!==e;){if(t.nodeToRestore)return!1;t=t.parent}return(null==t?void 0:t.scopeRef)===e}(e))){let t=D.clone();requestAnimationFrame((()=>{if(document.activeElement===document.body){let n=t.getTreeNode(e);for(;n;){if(n.nodeToRestore&&document.body.contains(n.nodeToRestore))return void A(n.nodeToRestore);n=n.parent}for(n=t.getTreeNode(e);n;){if(n.scopeRef&&D.getTreeNode(n.scopeRef))return void K(n.scopeRef.current,!0);n=n.parent}}}))}}}),[e,t])}(d,o,n),function(e,t){const n=r.useRef(t);(0,r.useEffect)((()=>{n.current&&(N=e,S(document.activeElement,N.current)||K(e.current)),n.current=!1}),[e])}(d,i),(0,r.useEffect)((()=>{if(d){let e=document.activeElement,t=null;if(S(e,d.current)){for(let n of D.traverse())S(e,n.scopeRef.current)&&(t=n);t===D.getTreeNode(d)&&(N=t.scopeRef)}return()=>{let e=D.getTreeNode(d).parent.scopeRef;d!==N&&!F(d,N)||e&&!D.getTreeNode(e)||(N=e),D.removeTreeNode(d)}}}),[d]);let f=(0,r.useMemo)((()=>function(e){return{focusNext(t={}){let n=e.current,{from:r,tabbable:o,wrap:c,accept:i}=t,u=r||document.activeElement,l=n[0].previousElementSibling,d=k(w(n),{tabbable:o,accept:i},n);d.currentNode=S(u,n)?u:l;let a=d.nextNode();return!a&&c&&(d.currentNode=l,a=d.nextNode()),a&&A(a,!0),a},focusPrevious(t={}){let n=e.current,{from:r,tabbable:o,wrap:c,accept:i}=t,u=r||document.activeElement,l=n[n.length-1].nextElementSibling,d=k(w(n),{tabbable:o,accept:i},n);d.currentNode=S(u,n)?u:l;let a=d.previousNode();return!a&&c&&(d.currentNode=l,a=d.previousNode()),a&&A(a,!0),a},focusFirst(t={}){let n=e.current,{tabbable:r,accept:o}=t,c=k(w(n),{tabbable:r,accept:o},n);c.currentNode=n[0].previousElementSibling;let i=c.nextNode();return i&&A(i,!0),i},focusLast(t={}){let n=e.current,{tabbable:r,accept:o}=t,c=k(w(n),{tabbable:r,accept:o},n);c.currentNode=n[n.length-1].nextElementSibling;let i=c.previousNode();return i&&A(i,!0),i}}}(d)),[]),m=(0,r.useMemo)((()=>({focusManager:f,parentNode:s})),[s,f]);return r.createElement(E.Provider,{value:m},r.createElement("span",{"data-focus-scope-start":!0,hidden:!0,ref:u}),t,r.createElement("span",{"data-focus-scope-end":!0,hidden:!0,ref:l}))}function T(){var e;return null===(e=(0,r.useContext)(E))||void 0===e?void 0:e.focusManager}const y=["input:not([disabled]):not([type=hidden])","select:not([disabled])","textarea:not([disabled])","button:not([disabled])","a[href]","area[href]","summary","iframe","object","embed","audio[controls]","video[controls]","[contenteditable]"],R=y.join(":not([hidden]),")+",[tabindex]:not([disabled]):not([hidden])";y.push('[tabindex]:not([tabindex="-1"]):not([disabled])');const L=y.join(':not([hidden]):not([tabindex="-1"]),');function w(e){return e[0].parentElement}function x(e){let t=D.getTreeNode(N);for(;t&&t.scopeRef!==e;){if(t.contain)return!1;t=t.parent}return!0}function M(e){return C(e)}function S(e,t){return t.some((t=>t.contains(e)))}function C(e,t=null){if(e instanceof Element&&e.closest("[data-react-aria-top-layer]"))return!0;for(let{scopeRef:n}of D.traverse(D.getTreeNode(t)))if(S(e,n.current))return!0;return!1}function F(e,t){var n;let r=null===(n=D.getTreeNode(t))||void 0===n?void 0:n.parent;for(;r;){if(r.scopeRef===e)return!0;r=r.parent}return!1}function A(e,t=!1){if(null==e||t){if(null!=e)try{e.focus()}catch(e){}}else try{b(e)}catch(e){}}function K(e,t=!0){let n=e[0].previousElementSibling,r=k(w(e),{tabbable:t},e);r.currentNode=n;let o=r.nextNode();t&&!o&&(r=k(w(e),{tabbable:!1},e),r.currentNode=n,o=r.nextNode()),A(o)}function k(e,t,n){let r=(null==t?void 0:t.tabbable)?L:R,o=document.createTreeWalker(e,NodeFilter.SHOW_ELEMENT,{acceptNode(e){var o;return(null==t||null===(o=t.from)||void 0===o?void 0:o.contains(e))?NodeFilter.FILTER_REJECT:!e.matches(r)||!h(e)||n&&!S(e,n)||(null==t?void 0:t.accept)&&!t.accept(e)?NodeFilter.FILTER_SKIP:NodeFilter.FILTER_ACCEPT}});return(null==t?void 0:t.from)&&(o.currentNode=t.from),o}class z{get size(){return this.fastMap.size}getTreeNode(e){return this.fastMap.get(e)}addTreeNode(e,t,n){let r=this.fastMap.get(null!=t?t:null),o=new P({scopeRef:e});r.addChild(o),o.parent=r,this.fastMap.set(e,o),n&&(o.nodeToRestore=n)}addNode(e){this.fastMap.set(e.scopeRef,e)}removeTreeNode(e){if(null===e)return;let t=this.fastMap.get(e),n=t.parent;for(let e of this.traverse())e!==t&&t.nodeToRestore&&e.nodeToRestore&&t.scopeRef.current&&S(e.nodeToRestore,t.scopeRef.current)&&(e.nodeToRestore=t.nodeToRestore);let r=t.children;n.removeChild(t),r.size>0&&r.forEach((e=>n.addChild(e))),this.fastMap.delete(t.scopeRef)}*traverse(e=this.root){if(null!=e.scopeRef&&(yield e),e.children.size>0)for(let t of e.children)yield*this.traverse(t)}clone(){let e=new z;for(let t of this.traverse())e.addTreeNode(t.scopeRef,t.parent.scopeRef,t.nodeToRestore);return e}constructor(){this.fastMap=new Map,this.root=new P({scopeRef:null}),this.fastMap.set(null,this.root)}}class P{addChild(e){this.children.add(e),e.parent=this}removeChild(e){this.children.delete(e),e.parent=void 0}constructor(e){this.children=new Set,this.contain=!1,this.scopeRef=e.scopeRef}}let D=new z,H=r.createContext(null);function I(e){let t=(0,r.useContext)(H)||{};!function(e,t){c((()=>{if(e&&e.ref&&t)return e.ref.current=t.current,()=>{e.ref.current=null}}),[e,t])}(t,e);let{ref:n,...o}=t;return o}function _(e,t){let{focusProps:n}=(0,v.KK)(e),{keyboardProps:o}=(0,v.v5)(e),c=d(n,o),i=I(t),u=e.isDisabled?{}:i,l=(0,r.useRef)(e.autoFocus);return(0,r.useEffect)((()=>{l.current&&t.current&&b(t.current),l.current=!1}),[t]),{focusableProps:d({...c,tabIndex:e.excludeFromTabOrder&&!e.isDisabled?-1:void 0},u)}}}}]);