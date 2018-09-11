/**
 * @author tomken
 * 2018年9月10日
 */
package com.it.orp.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 随机数生成
 * @author tomken
 * 2018年9月10日
 */
@Configuration
@ConfigurationProperties(prefix="orp")
@PropertySource("classpath:random.properties")
public class OrpRandom {
	private int number;
	private long bigNumber;
	private String uuid;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public long getBigNumber() {
		return bigNumber;
	}
	public void setBigNumber(long bigNumber) {
		this.bigNumber = bigNumber;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
