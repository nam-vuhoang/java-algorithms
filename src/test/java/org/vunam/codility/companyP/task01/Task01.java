package org.vunam.codility.companyP.task01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * @see Test feedback: https://app.codility.com/c%2Ffeedback%2FE28EPQ-8Q7%2F
 */
class Task01 {
	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd MMM yyyy");
	private static final int MAX_SIZE = 14 << 20; // 14 * 2^20
	private static final String ADMIN = "admin";
	private static final String NO_FILES_MESSAGE = "NO FILES";

	public String solution(String inputString) {
		// get the file list from the input string
		List<FileInfo> files = FileInfo.parse(inputString);

		// filter files according to the specification
		LocalDate date =
			files.stream()
				.filter(f -> f.getOwner().equals(ADMIN)) // owned by "admin"
				.filter(FileInfo::isExecutable) // is executable
				.filter(f -> f.getSize() < MAX_SIZE) // has size less than 14 * 2^20
				.map(FileInfo::getDate) // we need only date
				.sorted() // natural order by date
				.findFirst() // get the earliest date
				.orElse(null);

		return date != null ? DATE_FORMATTER.format(date) : NO_FILES_MESSAGE;
	}

	/**
	 * Represents a file info (contains fields owner, permission, date, size, name, and isExecutable)
	 */
	private static class FileInfo {
		/**
		 * Parse the input string to get a list of {@link} FileInfo}
		 * asssuming the input string is correct according to the specification.
		 */
		public static List<FileInfo> parse(String s) {
			List<FileInfo> files = new ArrayList<>();
			try (Scanner scanner = new Scanner(s)) {
				while (scanner.hasNextLine()) {
					String line = scanner.nextLine();
					FileInfo file = new FileInfo(line.substring(0, 6).trim(), // owner
							line.substring(7, 10), // permissions
							LocalDate.parse(line.substring(11, 22), DATE_FORMATTER), // date
							Integer.parseInt(line.substring(23, 33).trim()), // size
							line.substring(34).trim()); // name
					files.add(file);
				}
			}

			return files;
		}

		private final String owner;
		private final String permissions;
		private final LocalDate date;
		private final int size;
		private final String name;

		public FileInfo(String owner, String permissions, LocalDate date, int size, String name) {
			this.owner = owner;
			this.permissions = permissions;
			this.date = date;
			this.size = size;
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public String getOwner() {
			return owner;
		}

		public String getPermissions() {
			return permissions;
		}

		public LocalDate getDate() {
			return date;
		}

		public int getSize() {
			return size;
		}

		public boolean isExecutable() {
			return permissions.charAt(2) == 'x';
		}

		@Override
		public String toString() {
			return String.format("{ owner: '%s', permissions: '%s', date: '%s', size: %d, name: '%s', isExecutable: %s}",
					owner, permissions, date, size, name, isExecutable());
		}

	}

}
