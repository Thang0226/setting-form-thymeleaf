package com.codegym.model;

public class Setting {
	private String language;
	private int emailsPerPage;
	private boolean spamFiltered;
	private String signature;

	public Setting() {}

	public Setting(String language, int emailsPerPage, boolean spamFiltered, String signature) {
		this.language = language;
		this.emailsPerPage = emailsPerPage;
		this.spamFiltered = spamFiltered;
		this.signature = signature;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getEmailsPerPage() {
		return emailsPerPage;
	}

	public void setEmailsPerPage(int emailsPerPage) {
		this.emailsPerPage = emailsPerPage;
	}

	public boolean isSpamFiltered() {
		return spamFiltered;
	}

	public void setSpamFiltered(boolean spamFiltered) {
		this.spamFiltered = spamFiltered;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}
}
