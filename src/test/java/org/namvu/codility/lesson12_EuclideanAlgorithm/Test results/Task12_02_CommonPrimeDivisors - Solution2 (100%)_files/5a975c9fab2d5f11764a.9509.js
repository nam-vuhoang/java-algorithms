(globalThis.webpackChunkcodility=globalThis.webpackChunkcodility||[]).push([[9509],{84051:(e,t,n)=>{"use strict";n.r(t),n.d(t,{default:()=>s});var o,r=n(67294);function a(){return a=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},a.apply(this,arguments)}function i(e,t){return r.createElement("svg",a({viewBox:"0 0 24 24",ref:t},e),o||(o=r.createElement("path",{d:"M12 16l-4.73-4.509c-.577-.55-.168-1.491.648-1.491h8.164c.817 0 1.225.94.648 1.491L12 16z"})))}const l=(0,r.forwardRef)(i),s=l;l.displayName="SvgIcArrowDropDown"},4986:(e,t,n)=>{"use strict";n.r(t),n.d(t,{default:()=>s});var o,r=n(67294);function a(){return a=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},a.apply(this,arguments)}function i(e,t){return r.createElement("svg",a({viewBox:"0 0 24 24",ref:t},e),o||(o=r.createElement("path",{d:"M12 8l-4.73 4.509c-.577.55-.168 1.491.648 1.491h8.164c.817 0 1.225-.94.648-1.491L12 8z"})))}const l=(0,r.forwardRef)(i),s=l;l.displayName="SvgIcArrowDropUp"},71036:(e,t,n)=>{"use strict";n.d(t,{M:()=>v});var o=n(38205),r=n(67294),a=n(59242),i=n.n(a),l=n(75325),s=n(65114),c=n(83207),d=n(38052),u=n(69378);function p(){return p=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},p.apply(this,arguments)}const m={basic:{"emptyMessage.padding":"spacing32"},light:{"text.color":"coolgrey600","emptyMessage.padding":"spacing32"},panel:{"text.color":"coolgrey600","emptyMessage.backgroundColor":"white","emptyMessage.padding":"spacing32"},compactPanel:{"text.color":"coolgrey600","emptyMessage.backgroundColor":"white","emptyMessage.padding":"spacing16"}},g=32;function v(e){let{align:t,children:n,kind:o="basic",svg:a,...v}=e;return r.createElement(s.ZP,{componentStyles:m[o]},r.createElement(h,p({row:!0,alignItems:"start",gap:"spacing8",justifyContent:t,template:["auto","auto-shrink"]},v,{$_css:i()((0,s.KU)("emptyMessage.backgroundColor"),d.L),$_css2:i()((0,s.KU)("emptyMessage.padding"),u.f)}),r.createElement(c.Z,{svg:a,color:"textColor",size:g}),r.createElement(l.Z,{minHeight:g,gap:"spacing16",justifyContent:"center"},n)))}var h=(0,o.ZP)(l.Z).withConfig({displayName:"EmptyMessage___StyledBox",componentId:"sc-12dcw1g-0"})(["background-color:",";border-radius:6px;padding:",";"],(e=>e.$_css),(e=>e.$_css2))},47546:(e,t,n)=>{"use strict";n.d(t,{I:()=>o});const o=(0,n(67294).createContext)({features:[]})},94195:(e,t,n)=>{"use strict";function o(e,t){return!!t.features.find((t=>t.name===e))}n.d(t,{Z:()=>o})},45926:(e,t,n)=>{"use strict";n.d(t,{bZ:()=>d,TX:()=>u,IT:()=>c.I,U6:()=>s.Z,FJ:()=>p.Z});var o=n(67294),r=n(711),a=n.n(r),i=n(59704),l=n.n(i),s=n(94195),c=n(47546);function d(e){let{children:t,requiresOneOf:n=[],requiresAllOf:r=[],fallback:i=null}=e;const d=(0,o.useContext)(c.I),u=0===n.length||l()(n,(e=>(0,s.Z)(e,d)));return(0===r.length||a()(r,(e=>(0,s.Z)(e,d))))&&u?o.createElement(o.Fragment,null,t):i}const u=e=>{let{children:t}=e;const n=(0,o.useContext)(c.I);return(0,s.Z)("EXTERNAL_SUPPORT",n)?null:o.createElement(o.Fragment,null,t)};var p=n(12651)},12651:(e,t,n)=>{"use strict";n.d(t,{Z:()=>i});var o=n(67294),r=n(94195),a=n(47546);function i(e){const t=(0,o.useContext)(a.I);return(0,r.Z)(e,t)}},64424:(e,t,n)=>{"use strict";n.d(t,{Z:()=>j});var o=n(67294),r=n(38205),a=n(75613),i=n(45697),l=n.n(i);function s(e,t,n){return(t=function(e){var t=function(e,t){if("object"!=typeof e||null===e)return e;var n=e[Symbol.toPrimitive];if(void 0!==n){var o=n.call(e,"string");if("object"!=typeof o)return o;throw new TypeError("@@toPrimitive must return a primitive value.")}return String(e)}(e);return"symbol"==typeof t?t:String(t)}(t))in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}class c extends o.Component{constructor(){super(...arguments),s(this,"state",{})}static getDerivedStateFromProps(e,t){return{value:e.useCached?t.value:e.value}}render(){return this.props.children(this.state.value)}}s(c,"propTypes",{children:l().func.isRequired,useCached:l().bool,value:l().any});var d=n(27537),u=n.n(d);const p=e=>{let{onEscape:t}=e;return(0,o.useEffect)((()=>(window.addEventListener("keydown",n),()=>{window.removeEventListener("keydown",n)}))),null;function n(e){"esc"===u()(e)&&t()}};var m=n(75325);function g(){return g=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},g.apply(this,arguments)}var v=n(12800),h=n(99591);function f(){return f=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},f.apply(this,arguments)}const b=(0,r.ZP)(m.Z).withConfig({displayName:"ModalContent__Wrapper",componentId:"sc-1xqortz-0"})(["",";word-break:break-word;"],h.W2.basic);var w=n(65114),C=n(72465);const y=r.ZP.div.withConfig({displayName:"ModalHeader__Wrapper",componentId:"sc-1ov8syi-0"})(["padding:"," "," 0;"],C.W0.spacing32,C.W0.spacing32),E=(0,r.ZP)(h.W5).attrs({dark:!0}).withConfig({displayName:"ModalHeader__Heading",componentId:"sc-1ov8syi-1"})(["",""],(0,w.KU)("components.modal.header")),x=()=>{let e=null;return(0,o.useEffect)((()=>(t(),window.addEventListener("resize",t),()=>{window.removeEventListener("resize",t),window.cancelAnimationFrame(e),document.body.style.overflowY="",document.body.style.width=""}))),null;function t(){window.cancelAnimationFrame(e),e=window.requestAnimationFrame((()=>{document.body.style.overflowY="",document.body.style.width="";const e=document.body.getBoundingClientRect().width;document.body.style.overflowY="hidden",document.body.style.width=`${e}px`}))}},T=()=>((0,o.useEffect)((()=>(document.body.setAttribute("data-test-modal-open","true"),()=>{document.body.removeAttribute("data-test-modal-open")}))),null);var k=n(50347),P=n(41435),S=n(10257);function Z(){return Z=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},Z.apply(this,arguments)}function O(e,t,n){return(t=function(e){var t=function(e,t){if("object"!=typeof e||null===e)return e;var n=e[Symbol.toPrimitive];if(void 0!==n){var o=n.call(e,"string");if("object"!=typeof o)return o;throw new TypeError("@@toPrimitive must return a primitive value.")}return String(e)}(e);return"symbol"==typeof t?t:String(t)}(t))in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}const A=(0,r.F4)(["from{opacity:0;}to{opacity:1;}"]),M=(0,r.F4)(["from{opacity:1;}to{opacity:0;}"]),I=r.ZP.div.withConfig({displayName:"Modal__AnimationWrapper",componentId:"sc-d8fjyy-0"})(["animation-duration:",";animation-fill-mode:forwards;animation-name:",";background-color:",";z-index:",";",";"],C.NS.medium,(e=>e.isClosing?M:A),(e=>e.backdropColor?e.backdropColor:"rgba(0, 0, 0, 0.84)"),a.W5,(0,P.Z)({position:"fixed"}));class _ extends o.Component{constructor(){super(...arguments),O(this,"state",{}),O(this,"handleAnimationEnd",(e=>{e.target===e.currentTarget&&(this.state.isClosing?(this.setState({isClosing:!1}),this.props.onAfterClose&&this.props.onAfterClose()):this.props.onOpen&&this.props.onOpen())}))}static getDerivedStateFromProps(e,t){return{id:(0,S.Z)(_,"modal",e,t),isClosing:!e.show&&t.prevShow||t.isClosing,prevShow:e.show}}render(){const{show:e,backdropColor:t,children:n,preventCloseOnEsc:r,...i}=this.props,{id:l,isClosing:s}=this.state;return e||s?o.createElement(a.MA,{type:"modal"},o.createElement(o.Fragment,null,!r&&o.createElement(p,{onEscape:i.onClose}),o.createElement(x,null),o.createElement(T,null),o.createElement(k.h,{id:l},o.createElement(I,{isClosing:s,backdropColor:t,onAnimationEnd:this.handleAnimationEnd,"data-test-id":"modal-animation-wrapper","data-selector-id":"modal-animation-wrapper"},o.createElement(c,{value:n,useCached:s},(e=>o.createElement(v.ZP,Z({onBackdropClick:i.onClose},i),e))))))):null}}O(_,"Actions",(function(e){return o.createElement(m.Z,g({row:!0,gap:"spacing4",justifyContent:"end",padding:[0,"spacing32","spacing32"],"data-test-id":"modal-actions"},e))})),O(_,"Content",(function(e){let{children:t,padding:n=["spacing16","spacing32","spacing32"],...r}=e;const{describedBy:a}=(0,o.useContext)(v.oB);return o.createElement(b,f({padding:n,"aria-live":"polite",id:a,"data-test-id":"modal-content"},r),t)})),O(_,"Header",(function(e){let{children:t,headingComponent:n,...r}=e;const{labelledBy:a}=(0,o.useContext)(v.oB);return o.createElement(y,r,o.createElement(E,{as:n,id:a,"data-test-id":"modal-header"},t))})),O(_,"defaultProps",{size:"medium"});const j=_},12800:(e,t,n)=>{"use strict";n.d(t,{oB:()=>f,ZP:()=>b});var o=n(67294),r=n(84910),a=n(38205),i=n(65114),l=n(82373),s=n(31482),c=n(72465),d=n(33508),u=n(41435),p=n(39707);const m={extraLarge:{wideScreen:"1280px"},large:{tablet:"88%",laptop:"850px",regularScreen:"900px",wideScreen:"950px"},medium:{tablet:"70.4%",laptop:"680px",regularScreen:"720px",wideScreen:"760px"},small:{tablet:"70.4%",laptop:"560px",regularScreen:"580px",wideScreen:"600px"},tiny:{tablet:"70.4%",laptop:"440px",regularScreen:"440px",wideScreen:"440px"}},g=(Object.keys(m),a.ZP.div.withConfig({displayName:"ModalWindow__Wrapper",componentId:"sc-1blkd9p-0"})(["",";align-items:center;display:flex;flex-direction:column;"],(e=>e.floating&&`\n      ${(0,u.Z)()}\n      overflow: auto;\n    `))),v=a.ZP.div.withConfig({displayName:"ModalWindow__Spacer",componentId:"sc-1blkd9p-1"})(["flex:0 1 15%;min-height:12px;",";",";",";",";"],(0,p.A3)("tablet")`min-height: 16px;`,(0,p.A3)("laptop")`min-height: 24px;`,(0,p.A3)("regularScreen")`min-height: 32px;`,(0,p.A3)("wideScreen")`min-height: 48px;`),h=a.ZP.div.withConfig({displayName:"ModalWindow__Body",componentId:"sc-1blkd9p-2"})(["background-color:",";border-radius:",";box-shadow:",";margin:0 auto;width:90%;@media (forced-colors:active){border:1px solid;}",";",";",";",";",";",""],s.ix,c.E0,(e=>e.withShadow?c.AF.basic:"none"),(e=>e.isContentScrollable&&"overflow-y: auto"),(e=>m[e.size].tablet&&(0,p.A3)("tablet")`width: ${m[e.size].tablet};`),(e=>m[e.size].laptop&&(0,p.A3)("laptop")`width: ${m[e.size].laptop};`),(e=>m[e.size].regularScreen&&(0,p.A3)("regularScreen")`width: ${m[e.size].regularScreen};`),(e=>m[e.size].wideScreen&&(0,p.A3)("wideScreen")`width: ${m[e.size].wideScreen};`),(0,i.KU)("components.modal")),f=(0,o.createContext)({labelledBy:void 0,describedBy:void 0});function b(e){let{children:t,className:n,floating:a=!0,id:i,size:s="medium",role:c="dialog",withShadow:u,onBackdropClick:p,preventFocusScope:m,isContentScrollable:b,style:w,autoFocus:C=!0,containFocus:y=!0}=e;const E=(0,d.Z)(i),x=`${E}-header`,T="alertdialog"===c?`${E}-content`:void 0,[k,P]=function(e){const t=(0,o.useRef)(!1);return[(0,o.useCallback)((e=>{(0,l.Z)(e)&&(t.current=e.target===e.currentTarget)}),[]),(0,o.useCallback)((n=>{t.current&&n.target===n.currentTarget&&(0,l.Z)(n)&&(n.stopPropagation(),e&&e())}),[e])]}(p);!function(){const e=(0,o.useCallback)((e=>{e.target.matches("button")&&e.target.focus()}),[]);(0,o.useEffect)((()=>(document.addEventListener("mouseover",e),()=>document.removeEventListener("mouseover",e))))}();const S=o.createElement(h,{size:s,withShadow:u,role:c,"aria-modal":!0,"aria-labelledby":x,"aria-describedby":T,isContentScrollable:b},t);return o.createElement(f.Provider,{value:{labelledBy:x,describedBy:T}},o.createElement(g,{className:n,floating:a,onMouseDown:k,onMouseUp:P,"data-test-id":"modal-window-wrapper",style:w},a&&o.createElement(v,null),m?S:o.createElement(r.MT,{contain:y,restoreFocus:!0,autoFocus:C},S),a&&o.createElement(v,null)))}},54830:(e,t,n)=>{"use strict";n.d(t,{q:()=>i,Z:()=>o.Z});var o=n(64424),r=n(67294);function a(e,t,n){return(t=function(e){var t=function(e,t){if("object"!=typeof e||null===e)return e;var n=e[Symbol.toPrimitive];if(void 0!==n){var o=n.call(e,"string");if("object"!=typeof o)return o;throw new TypeError("@@toPrimitive must return a primitive value.")}return String(e)}(e);return"symbol"==typeof t?t:String(t)}(t))in e?Object.defineProperty(e,t,{value:n,enumerable:!0,configurable:!0,writable:!0}):e[t]=n,e}class i extends r.Component{constructor(){super(...arguments),a(this,"state",{show:!1}),a(this,"openModal",(()=>{this.setState({show:!0})})),a(this,"closeModal",(()=>{this.setState({show:!1})}))}render(){const e={openModal:this.openModal,modalProps:{onClose:this.closeModal,show:this.state.show},closeModal:this.closeModal};return this.props.children(e)}}},35997:(e,t,n)=>{"use strict";n.d(t,{Z:()=>l});var o=n(67294),r=n(89031),a=n(40605);const i=function(e){let{site:t,includeUserPII:n=!1}=e;const i=window?.pendo?.isReady?.(),l=(0,a.aF)();(0,o.useEffect)((()=>{if(i){const e={name:l.fullName,email:l.email};window.pendo.identify({visitor:{...(0,r.T)(t,l.id),role:l.permissions,canAssignInterviewers:l.canAssignCodeLiveInterviewers,...n?e:{}},account:{...(0,r.T)(t,l.account.id),name:l.account.company,analyticsPlan:l.account.analyticsPlan}})}}),[n,i,t,l])};function l(e){let{projectApiKey:t,includeUserPII:n=!1,site:o}=e;return i({projectApiKey:t,includeUserPII:n,site:o}),null}},89031:(e,t,n)=>{"use strict";function o(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:"";return e?{id:`${e}-${t}`,site:e,siteSpecificId:t}:{id:t}}n.d(t,{T:()=>o})},53308:(e,t,n)=>{"use strict";n.d(t,{x:()=>C});var o=n(67294),r=n(38205),a=n(62219),i=n(44112),l=n(72465);const s=l.W0.spacing8,c=Math.sqrt(2),d=a.f9`
  M${6} 0
  L0 ${6}
  L${6} ${12}
  L${12} ${6}
  Z
`,u=a.f9`
  M${6} ${c}
  L${c} ${6}
  L${6} ${12-c}
  L${12-c} ${6}
  Z
`,p={bottom:"1 0 10 6",left:"6 1 6 10",right:"0 1 6 10",top:"1 6 10 6"};var m=n(38052),g=n(69009);const v=r.ZP.div.withConfig({displayName:"Bubble__Wrapper",componentId:"sc-rv7m73-0"})(["position:relative;",";"],(function(e){let{hasArrow:t,placement:n}=e;const o={};return t&&(o[`padding-${i.C4[i.sX[n]]}`]=5),o})),h=r.ZP.svg.withConfig({displayName:"Bubble__ArrowWrapper",componentId:"sc-rv7m73-1"})(["display:block;height:100%;position:absolute;width:100%;",";"],(function(e){let{placement:t}=e;const n=i.sX[t],o=(0,i.CT)(n),r=(0,i.ZK)(t),a={margin:o?`0 ${s}`:`${s} 0`,height:o?6:10,width:o?10:6,[n]:"calc(100% - 6px)"};switch(r){case"base":a[o?"left":"top"]="50%",a.margin="0",a.transform=o?"translate(-50%, 0)":"translate(0, -50%)";break;case"start":a[o?"left":"top"]="0";break;case"end":a[o?"right":"bottom"]="0"}return a})),f=r.ZP.path.withConfig({displayName:"Bubble__ArrowBorder",componentId:"sc-rv7m73-2"})(["fill:",";"],(e=>(0,m.L)(e.border))),b=r.ZP.path.withConfig({displayName:"Bubble__ArrowBody",componentId:"sc-rv7m73-3"})(["fill:",";"],(e=>(0,m.L)(e.background))),w=r.ZP.div.withConfig({displayName:"Bubble__BubbleBody",componentId:"sc-rv7m73-4"})(["background-color:",";border-radius:",";padding:",";position:relative;",";"],(e=>(0,m.L)(e.background)),l.E0,(e=>(0,g.f)(e.padding)),(e=>e.border&&`border: 1px solid ${(0,m.L)(e.border)}`));function C(e){let{background:t,children:n,hasArrow:r=!1,padding:a,placement:l="bottom",border:s=t}=e;const c=i.sX[l];return o.createElement(v,{hasArrow:r,placement:l},r&&o.createElement(h,{viewBox:p[c],placement:l},o.createElement(f,{d,border:s})),o.createElement(w,{"aria-live":"polite",background:t,border:s,padding:a},n),r&&o.createElement(h,{viewBox:p[c],placement:l},o.createElement(b,{d:u,background:t})))}},92587:(e,t,n)=>{"use strict";n.d(t,{f:()=>a,S:()=>i});var o=n(67294),r=n(83918);const a=(0,o.createContext)(r.Z);function i(){return(0,o.useContext)(a)}},81178:(e,t,n)=>{"use strict";n.d(t,{z:()=>a});var o=n(67294),r=n(78619);const a=(0,o.createContext)(r._m)},53594:(e,t,n)=>{"use strict";n.d(t,{z:()=>o.z});var o=n(81178)},12657:(e,t,n)=>{"use strict";n.d(t,{Dy:()=>d,md:()=>s,f0:()=>c});var o=n(67294),r=n(40360);const a={getLoginLink:e=>r.getUrlWithQueryString("/accounts/login/",{next:e})},i=(0,o.createContext)(a);var l=n(3e3);const s=e=>{let{value:{loginUrl:t,loginServiceProvider:n},children:r}=e;const s=(0,o.useMemo)((()=>t&&"internal"!==n?{getLoginLink:e=>(0,l.Z)(t,{next:e})}:a),[t,n]);return o.createElement(i.Provider,{value:s},r)},c=()=>(0,o.useContext)(i),d=i.Consumer},23995:(e,t,n)=>{"use strict";n.d(t,{JH:()=>r,St:()=>a});var o=n(67294);const r={loading:!0,user:{isSuperuser:!1,isStaff:!1,email:"",teams:[],canSeeTeamsPage:!1,currentTeamId:"",passwordExpiry:{},account:{options:{},hasInterviewerLoginEnabled:!0,hasPublicLinksEnabled:!1,activeUsersCount:1,availableTicketsCount:1,activePlatformUsersCount:1},canSendInvitation:!1,canAssignTestReviewers:!1,canAssignCodeLiveInterviewers:!1,canUseCodeLive:!1,clusters:[]}},a=(0,o.createContext)(r)},40605:(e,t,n)=>{"use strict";n.d(t,{St:()=>o.St,fS:()=>d,aF:()=>p.Z});var o=n(23995),r=n(67294),a=n(50308),i=n.n(a),l=n(7929),s=n(92091);function c(){return c=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},c.apply(this,arguments)}function d(e){return r.createElement(u,c({},e,{fetchUserApi:()=>l.ZP.get("/accounts/api/me/")}))}function u(e){let{children:t,onLoaded:n=i(),fetchUserApi:a}=e;const[l,c]=(0,r.useState)(o.JH),d=(0,s.Sr)(a,{onSuccess:e=>{c({user:e,loading:!1}),n(e)},onError(){}},[c]);return(0,r.useEffect)((()=>{d()}),[d]),r.createElement(o.St.Provider,{value:l},t)}var p=n(24684)},24684:(e,t,n)=>{"use strict";n.d(t,{Z:()=>a});var o=n(67294),r=n(23995);function a(){const{user:e}=(0,o.useContext)(r.St);return e}},21959:(e,t,n)=>{"use strict";n.d(t,{g:()=>l,u:()=>p});var o=n(50308),r=n.n(o),a=n(67294);const i={open:r(),setPlacement:r()},l=(0,a.createContext)(i);var s=n(40605),c=n(85126);const d=5e3;function u(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:window.document,n=arguments.length>2&&void 0!==arguments[2]?arguments[2]:d;return new Promise(((o,r)=>{const a=setTimeout((()=>{r(`waitForElement function timed out after ${n}ms`)}),n);let i=t.querySelector(e);const l=setInterval((()=>{null===i?i=t.querySelector(e):(clearInterval(l),clearTimeout(a),o(i))}),300)}))}function p(e){let{children:t}=e;const[n,o]=(0,a.useState)(!1),[r,d]=(0,a.useState)(i),p=(0,s.aF)();return(0,a.useEffect)((()=>{!async function(){const e=await async function(){return await(0,c.x)("https://static.zdassets.com/ekr/snippet.js?key=b29f241e-00f4-4da5-893a-93b29d4ef00a",{id:"ze-snippet"}),window.zE("webWidget","hide"),window.zE("webWidget:on","close",(()=>{window.zE("webWidget","hide")})),window.zE("webWidget:on","open",(async()=>{const e=await u("iframe#webWidget");(await u("textarea",e.contentWindow?.document)).focus()})),{open:()=>{window.zE("webWidget","show"),window.zE("webWidget","open")},setPlacement:e=>{window.zESettings={...window.zESettings,webWidget:e}}}}();d(e),o(!0)}()}),[]),(0,a.useEffect)((()=>{n&&function(e){window.zE("webWidget","prefill",{name:{value:e?.fullName},email:{value:e?.email}})}(p)}),[n,p]),a.createElement(l.Provider,{value:r},t)}},15221:(e,t,n)=>{"use strict";n.d(t,{on:()=>l,xt:()=>s});var o=n(67294),r=n(50308),a=n.n(r);const i=(0,o.createContext)({hasOpenModal:!1,setHasOpenModal:a()});i.displayName="TableModalContext";const l=()=>(0,o.useContext)(i),s=e=>{let{children:t}=e;const[n,r]=(0,o.useState)(!1),a=(0,o.useMemo)((()=>({hasOpenModal:n,setHasOpenModal:r})),[n,r]);return o.createElement(i.Provider,{value:a},t)}},28954:(e,t,n)=>{"use strict";n.d(t,{Z:()=>F,E:()=>O});var o=n(67294),r=n(50308),a=n.n(r),i=n(57557),l=n.n(i),s=n(95062),c=n.n(s),d=n(38205),u=n(75325),p=n(83207),m=n(31482),g=n(72465),v=n(15221);const h="data-focus-id";function f(e,t){const n=b(t),o=`*[${h}="${n}"]`;return e.querySelector(o)}function b(e){let{row:t,column:n}=e;return`table-cell-${t}-${n}`}function w(e,t){return(o=e+(arguments.length>2&&void 0!==arguments[2]?arguments[2]:1))>=(n=t-1)?n:o;var n,o}function C(e){return(t=e-(arguments.length>1&&void 0!==arguments[1]?arguments[1]:1))<0?0:t;var t}function y(e){return e.querySelectorAll("[tabindex], a, button, input:not([type='hidden'])")}const E=["ArrowLeft","ArrowRight","ArrowDown","ArrowUp","PageUp","PageDown","Home","End"];var x=n(69378);function T(){return T=Object.assign?Object.assign.bind():function(e){for(var t=1;t<arguments.length;t++){var n=arguments[t];for(var o in n)Object.prototype.hasOwnProperty.call(n,o)&&(e[o]=n[o])}return e},T.apply(this,arguments)}const k=d.ZP.table.withConfig({displayName:"TableComponent__Table",componentId:"sc-e2pd1n-0"})(["width:100%;background-color:white;border:",";border-radius:",";border-collapse:separate;"],(e=>e.borderless?"unset":`1px solid ${m.Xe}`),g.E0),P=d.ZP.tr.withConfig({displayName:"TableComponent__THeadTr",componentId:"sc-e2pd1n-1"})(["height:40px;text-align:left;background-color:",";"],m.ZG),S=d.ZP.tr.withConfig({displayName:"TableComponent__TBodyTr",componentId:"sc-e2pd1n-2"})(["height:","px;&:hover{background-color:",";}",""],(e=>e.large?72:36),m.my,(e=>e.customStyles)),Z="\n  text-overflow: ellipsis;\n  white-space: nowrap;\n  overflow: hidden;\n",O=g.spacingInPx.spacing16,A=(0,d.iv)(["width:",";min-width:",";max-width:",";margin:0;padding:0 ",";:first-child{padding-left:","px;}:last-child{border-right:0;padding-right:",";}"],(e=>{let{$width:t}=e;return(0,x.f)(t)}),(e=>{let{minWidth:t}=e;return(0,x.f)(t)}),(e=>{let{maxWidth:t}=e;return(0,x.f)(t)}),g.W0.spacing8,O,g.W0.spacing8),M=d.ZP.th.withConfig({displayName:"TableComponent__Th",componentId:"sc-e2pd1n-3"})(["height:40px;",""],A),I=d.ZP.td.withConfig({displayName:"TableComponent__Td",componentId:"sc-e2pd1n-4"})([""," ",""],A,(e=>e.hasEllipsis&&`\n      ${Z}\n      p {\n        ${Z}\n      }\n    `)),_=(0,d.ZP)(I).withConfig({displayName:"TableComponent__EmbeddedContentTd",componentId:"sc-e2pd1n-5"})(["&&{padding:0;}"]),j=(0,d.ZP)(S).withConfig({displayName:"TableComponent__TopMessageTr",componentId:"sc-e2pd1n-6"})(["&:hover{background-color:initial;}"]),L=(0,d.ZP)(I).withConfig({displayName:"TableComponent__TopMessageTd",componentId:"sc-e2pd1n-7"})(["border-bottom:1px solid ",";&&{padding:0;}"],m.Xe),$=j,N=L,F=e=>{let{tableProps:t,bodyProps:r,headerGroups:i,rows:s,prepareRow:d,numberOfColumns:m,embeddedContent:g,bottomMessage:x,topMessage:Z,borderless:O,generateHTMLRowId:A,dataTestId:F,onRowFocus:W=a(),onRowClick:z=a(),onRowMouseOver:B=a(),onRowMouseLeave:R=a(),getRowCss:U=c(),onHeaderClick:D,hasInteractiveContent:H=!0,onBlur:q=a(),keyboardNavigationEnabled:K=!0}=e;const X=(0,o.useRef)(null),{tableFocusAttributes:G,getCellFocusAttributes:J}=function(e){return{tableFocusAttributes:(0,o.useMemo)((()=>e?{tabIndex:0,role:"grid"}:{}),[e]),getCellFocusAttributes:(0,o.useCallback)(((t,n)=>e?{[h]:b({row:t,column:n}),tabIndex:-1}:{}),[e])}}(H),{onKeyDown:V,onCellFocus:Y,onTableBlur:Q,focusOnActiveCell:ee}=function(e,t,n){let r=!(arguments.length>3&&void 0!==arguments[3])||arguments[3];const{activeCellCoordinates:a,activeChildIndex:i,moveLeft:l,moveRight:s,moveToCell:c,moveToNextRow:d,moveToPreviousRow:u,moveOnePageDown:p,moveOnePageUp:m,moveToFirstColumn:g,moveToLastColumn:v,moveToFirstCell:b,moveToLastCell:x}=function(e,t){let{numberOfRows:n,numberOfColumns:r}=t;const[a,i]=(0,o.useState)(0),[l,s]=(0,o.useState)(0),{activeChildIndex:c,canMoveToNextChild:d,canMoveToPreviousChild:u,moveToPreviousChild:p,moveToNextChild:m,clearActiveChild:g}=function(e,t){const[n,r]=(0,o.useState)(0),[a,i]=(0,o.useState)(0),l=(0,o.useMemo)((()=>n>0&&a>0),[a,n]),s=(0,o.useMemo)((()=>n>0&&a<n-1),[a,n]),c=(0,o.useCallback)((()=>i((e=>w(e,n)))),[n]),d=(0,o.useCallback)((()=>i(C)),[]),u=(0,o.useCallback)((()=>i(0)),[]);return(0,o.useEffect)((function(){const n=e?.current;if(n){const e=f(n,t);e&&r(y(e).length)}}),[t,e]),{activeChildIndex:a,canMoveToNextChild:s,canMoveToPreviousChild:l,moveToNextChild:c,moveToPreviousChild:d,clearActiveChild:u}}(e,{row:l,column:a}),v=(0,o.useCallback)((e=>{let{row:t,column:n}=e;s(t),i(n)}),[]),h=(0,o.useCallback)((()=>s(C)),[]),b=(0,o.useCallback)((()=>s((e=>w(e,n)))),[n]),E=(0,o.useCallback)((()=>{i(C),g()}),[g]),x=(0,o.useCallback)((()=>{i((e=>w(e,r))),a<r-1&&g()}),[a,g,r]),T=(0,o.useCallback)((()=>{u?p():E()}),[u,p,E]),k=(0,o.useCallback)((()=>{d?m():x()}),[d,m,x]),P=(0,o.useCallback)((()=>s((e=>C(e,10)))),[]),S=(0,o.useCallback)((()=>s((e=>w(e,n,10)))),[n]),Z=(0,o.useCallback)((()=>i(0)),[]),O=(0,o.useCallback)((()=>i(r-1)),[r]),A=(0,o.useCallback)((()=>v({row:0,column:0})),[v]),M=(0,o.useCallback)((()=>v({row:n-1,column:r-1})),[v,r,n]);return{activeCellCoordinates:(0,o.useMemo)((()=>({row:l,column:a})),[a,l]),activeChildIndex:c,moveToCell:v,moveLeft:T,moveToNextRow:b,moveRight:k,moveToPreviousRow:h,moveOnePageDown:S,moveOnePageUp:P,moveToFirstColumn:Z,moveToLastColumn:O,moveToFirstCell:A,moveToLastCell:M}}(e,t),{enterTable:T,leaveAndRefocusOnTable:k,onCellFocus:P,onTableBlur:S,focusOnActiveCell:Z}=function(e){let{tableRef:t,onLeaveTable:n,moveToCell:r,activeCellCoordinates:a,activeChildIndex:i}=e;const[l,s]=(0,o.useState)(!1),[c,d]=(0,o.useState)(!1),u=(0,o.useCallback)((()=>{l||(r({row:0,column:0}),s(!0))}),[l,r]),p=(0,o.useCallback)((()=>{s(!1),n()}),[n]),m=(0,o.useCallback)((()=>{l&&(p(),d(!0))}),[l,p]),g=(0,o.useCallback)((e=>{const t=function(e){const t=e.match(/\d+/g);return 2===t?.length?{row:Number(t[0]),column:Number(t[1])}:null}(e.currentTarget?.getAttribute(h)??"");t&&(r(t),s(!0))}),[r]),v=(0,o.useCallback)((e=>{e.currentTarget.contains(e.relatedTarget)||p()}),[p]),b=(0,o.useCallback)((()=>{const e=t?.current;if(e&&l){const t=f(e,a);t&&function(e,t){const n=y(e);n.length>t?n[t].focus():e.focus()}(t,i)}}),[a,i,l,t]);return(0,o.useEffect)(b,[b,a,i,l]),(0,o.useEffect)((function(){c&&(t?.current?.focus(),d(!1))}),[c,t]),{isInsideTable:l,enterTable:u,leaveTable:p,leaveAndRefocusOnTable:m,onCellFocus:g,onTableBlur:v,focusOnActiveCell:b}}({tableRef:e,moveToCell:c,activeCellCoordinates:a,activeChildIndex:i,onLeaveTable:n});return{onKeyDown:(0,o.useCallback)((e=>{if(r)switch(E.includes(e.key)&&e.preventDefault(),e.key){case"Enter":T();break;case"Escape":case"Tab":k();break;case"ArrowLeft":l();break;case"ArrowRight":s();break;case"ArrowDown":d();break;case"ArrowUp":u();break;case"PageUp":m();break;case"PageDown":p();break;case"Home":(e.ctrlKey?b:g)();break;case"End":(e.ctrlKey?x:v)()}}),[l,s,d,u,m,p,b,g,x,v,T,k,r]),onCellFocus:P,onTableBlur:S,focusOnActiveCell:Z}}(X,{numberOfRows:s.length+1,numberOfColumns:m},q,K),{hasOpenModal:te}=(0,v.on)(),ne=e=>{te||Y(e)};return(0,o.useEffect)(ee,[ee,s]),o.createElement(k,T({ref:X},t,G,{onKeyDown:V,onBlur:Q,borderless:O,"data-test-id":F}),o.createElement("thead",null,i.map((e=>o.createElement(P,e.getHeaderGroupProps(),e.headers.map(((e,t)=>{const r=e.getHeaderProps(e.getSortByToggleProps());function a(e){r.onClick&&r.onClick(e)}return o.createElement(M,T({},l()(r,["onClick"]),J(0,t),{onFocus:Y,onMouseDown:function(t){D&&e.canSort?(t.persist(),D((()=>a(t)))):a(t)},$width:e.width,maxWidth:e.maxWidth,minWidth:e.minWidth}),o.createElement(u.Z,T({row:!0,gap:"spacing4",height:44,alignItems:"center",template:"end"===e.justifyHeaderContent?e.isSorted?["auto",21]:"auto":["auto",21],justifyContent:e.justifyHeaderContent??"start"},e.headerBoxWrapperProps),e.render("Header"),e.isSorted?o.createElement(p.Z,{svg:e.isSortedDesc?n(84051):n(4986),size:20,color:"coolgrey500"}):o.createElement("div",null)))})))))),o.createElement("tbody",r,g&&o.createElement("tr",{"data-test-id":"embedded-content-row"},o.createElement(_,{colSpan:m},g)),o.createElement(o.Fragment,null,Z&&o.createElement(j,{large:0===s.length,"data-test-id":"top-message-row"},o.createElement(L,{colSpan:m},Z)),s.map(((e,t)=>(d(e),o.createElement(S,T({},e.getRowProps(),{customStyles:U(e.original),onFocus:()=>W(e.id),onClick:()=>z(e.id),onMouseOver:()=>B(e.id),onMouseLeave:()=>R(e.id),id:A?A(e.id):void 0}),e.cells.map(((e,n)=>o.createElement(I,T({},e.getCellProps(),J(t+1,n),{onFocus:ne,$width:e.column.width,maxWidth:e.column.maxWidth,minWidth:e.column.minWidth,height:e.column.height,hasEllipsis:e.column.hasEllipsis}),e.render("Cell")))))))),x&&o.createElement($,{large:0===s.length},o.createElement(N,{colSpan:m},x)))))}},95712:(e,t,n)=>{"use strict";n.d(t,{Z:()=>l});var o=n(67294),r=n(38205),a=n(99591);const i=(0,r.ZP)(a.Lp).withConfig({displayName:"HeaderCell__StyledHeader",componentId:"sc-51vlui-0"})(["",""],(e=>e.indent?"padding-left: 8px":void 0)),l=e=>{let{name:t,indent:n}=e;const r=`column-header-${t}`;return o.createElement(i,{light:!0,indent:n,"data-test-id":r,"data-selector-id":r},t)}},69123:(e,t,n)=>{"use strict";n.d(t,{Z:()=>r});var o=n(17563);const r=function(){let e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:window.location.search;return(0,o.parse)(e)}},84102:(e,t,n)=>{"use strict";n.d(t,{Z:()=>s});var o=n(14293),r=n.n(o),a=n(14176),i=n.n(a),l=n(17563);function s(e){let{withQuerySign:t=!0}=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};const n=i()(e,r()),o=(0,l.stringify)(n);return t?0===o.length?"":`?${o}`:o}},3e3:(e,t,n)=>{"use strict";n.d(t,{Z:()=>r});var o=n(84102);function r(e,t){return`${e}${(0,o.Z)(t)}`}},88800:(e,t,n)=>{"use strict";n.d(t,{j:()=>x,D:()=>T});var o=n(67294),r=n(45926),a=n(40153),i=n(35997),l=n(92587),s=n(53594),c=n(12657),d=n(40605),u=n(21959),p=n(78619),m=n(71709),g=n(61217),v=n(30381),h=n.n(v),f=n(41609),b=n.n(f),w=n(69123),C=n(4437);const y={initializeServices:m.j2,initializeMomentThresholds:function(){h().relativeTimeThreshold("s",60),h().relativeTimeThreshold("m",60),h().relativeTimeThreshold("h",24),h().relativeTimeThreshold("d",28),h().relativeTimeThreshold("M",12)},trackPageView:function(){let e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:window.location.pathname,t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:m.F2.track;const n=(0,w.Z)();t({id:"common.page_view",version:1,data:b()(n)?{path:e}:{path:e,query:n}})}};let E=!1;function x(){let{initializeServices:e,initializeMomentThresholds:t,trackPageView:n}=arguments.length>0&&void 0!==arguments[0]?arguments[0]:y;return window.config=window.config||(0,p.kL)(),E||(e(window.config),t(),n(),E=!0),new Promise((e=>{window.addEventListener("load",(()=>{e()}))}))}function T(e){let t=arguments.length>1&&void 0!==arguments[1]?arguments[1]:{};return(0,C.V_)(".js-root",(t=>o.createElement(c.md,{value:(0,g.Z)("login-context",{loginServiceProvider:"internal",loginUrl:""})},o.createElement(s.z.Provider,{value:m.vc},o.createElement(d.fS,null,o.createElement(u.u,null,o.createElement(a.N$,null,o.createElement(l.f.Provider,{value:m.F2.track},o.createElement(r.IT.Provider,{value:(0,g.Z)("features",{features:[]})},o.createElement(i.Z,m.vc.pendo),(0,C.Sc)("base"),o.createElement(e,t))))))))),t)}},39707:(e,t,n)=>{"use strict";n.d(t,{A3:()=>i,ae:()=>s,w4:()=>l});var o=n(38205),r=n(72465);function a(e,t){const n=t?"min":"max",a=r.rg[e]-(t?0:1);return function(e){for(var t=arguments.length,r=new Array(t>1?t-1:0),i=1;i<t;i++)r[i-1]=arguments[i];return(0,o.iv)(["@media only screen and (","-width:","px){",";}"],n,a,(0,o.iv)(e,...r))}}function i(e){return a(e,!0)}function l(e){return a(e,!1)}function s(e,t){const n=r.rg[e],a=r.rg[t]-1;return function(e){for(var t=arguments.length,r=new Array(t>1?t-1:0),i=1;i<t;i++)r[i-1]=arguments[i];return(0,o.iv)(["@media only screen and (min-width:","px) and (max-width:","px){",";}"],n,a,(0,o.iv)(e,...r))}}},3357:(e,t,n)=>{var o={"./en-gb":22243,"./en-gb.js":22243};function r(e){var t=a(e);return n(t)}function a(e){if(!n.o(o,e)){var t=new Error("Cannot find module '"+e+"'");throw t.code="MODULE_NOT_FOUND",t}return o[e]}r.keys=function(){return Object.keys(o)},r.resolve=a,e.exports=r,r.id=3357}}]);