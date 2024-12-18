package com.codegym.controller;

import com.codegym.model.Setting;
import com.codegym.service.ISettingService;
import com.codegym.service.SettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/setting")
public class SettingController {
	@Autowired
	private ISettingService settingService;
	private final String[] langList = {"English", "Vietnamese", "Japanese", "Chinese"};
	private final int[] sizes = {5, 10, 15, 25, 50, 100};

	@GetMapping
	public String showSettings(Model model) {
		Setting setting = settingService.show();
		model.addAttribute("setting", setting);
		model.addAttribute("langList", langList);
		model.addAttribute("sizes", sizes);
		return "index";
	}

	@PostMapping("/update")
	public String updateSetting(@ModelAttribute Setting setting) {
		settingService.update(setting);
		return "redirect:/setting";
	}
}
