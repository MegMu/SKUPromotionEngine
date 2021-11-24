package com.example.promotionengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSKU {

	@JsonProperty("SKUA")
	private Integer SKUA;
	@JsonProperty("SKUB")
	private Integer SKUB;
	@JsonProperty("SKUC")
	private Integer SKUC;
	@JsonProperty("SKUD")
	private Integer SKUD;

	public Integer getSKUA() {
		return SKUA;
	}

	public void setSKUA(Integer sKUA) {
		SKUA = sKUA;
	}

	public Integer getSKUB() {
		return SKUB;
	}

	public void setSKUB(Integer sKUB) {
		SKUB = sKUB;
	}

	public Integer getSKUC() {
		return SKUC;
	}

	public void setSKUC(Integer sKUC) {
		SKUC = sKUC;
	}

	public Integer getSKUD() {
		return SKUD;
	}

	public void setSKUD(Integer sKUD) {
		SKUD = sKUD;
	}

}
