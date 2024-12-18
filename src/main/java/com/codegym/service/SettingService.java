package com.codegym.service;

import com.codegym.model.Setting;

public class SettingService implements ISettingService {
	private Setting setting;

	public SettingService() {
		setting = new Setting("English", 25, false, "Thor\n\nKing, Asgard");
	}

	@Override
	public Setting show() {
		return setting;
	}

	@Override
	public void update(Setting newSetting) {
		setting.setLanguage(newSetting.getLanguage());
		setting.setEmailsPerPage(newSetting.getEmailsPerPage());
		setting.setSpamFiltered(newSetting.isSpamFiltered());
		setting.setSignature(newSetting.getSignature());
	}
}
