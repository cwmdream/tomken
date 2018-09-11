/**
 * @author tomken
 * 2018年9月10日
 */
package com.it.orp.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 配置类
 * @author tomken
 * 2018年9月10日
 */
@Component
public class ApplicationProperties {
	@Value("${spring.active.profile}")
	private String profile;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
}
