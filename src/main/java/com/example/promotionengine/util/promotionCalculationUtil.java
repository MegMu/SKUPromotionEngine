package com.example.promotionengine.util;

import com.example.promotionengine.constant.EngineConstants;

public class promotionCalculationUtil {

	public Integer totalPriceofA(Integer SKUA) {

		Integer totalSKUAPrice = 0;

		if (SKUA >= 3) {

			Integer NumOfPromo = SKUA / 3;
			Integer NumOfSingle = SKUA % 3;

			totalSKUAPrice = (NumOfPromo > 0) ? NumOfPromo * EngineConstants.SKUA_PROMO_PRICE_FOR3 : totalSKUAPrice;

			totalSKUAPrice = (NumOfSingle > 0) ? NumOfSingle * EngineConstants.SKUA_SINGLE_PRICE : totalSKUAPrice;

			return totalSKUAPrice;

		} else {

			totalSKUAPrice = SKUA * EngineConstants.SKUA_SINGLE_PRICE;
			return totalSKUAPrice;

		}

	}

	public Integer totalPriceofB() {
		return null;

	}

	public Integer totalPriceofC() {
		return null;

	}

	public Integer totalPriceofD() {
		return null;

	}

	public Integer totalPriceofCD() {
		return null;

	}

}
