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

	public Integer totalPriceofB(Integer SKUB) {

		Integer totalSKUBPrice = 0;

		if (SKUB >= 3) {

			Integer NumOfPromo = SKUB / 3;
			Integer NumOfSingle = SKUB % 3;

			totalSKUBPrice = (NumOfPromo > 0) ? NumOfPromo * EngineConstants.SKUB_PROMO_PRICE_FOR2 : totalSKUBPrice;

			totalSKUBPrice = (NumOfSingle > 0) ? NumOfSingle * EngineConstants.SKUB_SINGLE_PRICE : totalSKUBPrice;

			return totalSKUBPrice;

		} else {

			totalSKUBPrice = SKUB * EngineConstants.SKUB_SINGLE_PRICE;
			return totalSKUBPrice;

		}

	}

	public Integer totalPriceofC(Integer SKUC) {

		Integer totalSKUCPrice = 0;

		totalSKUCPrice = SKUC * EngineConstants.SKUC_SINGLE_PRICE;
		return totalSKUCPrice;

	}

	public Integer totalPriceofD(Integer SKUD) {
		Integer totalSKUDPrice = 0;

		totalSKUDPrice = SKUD * EngineConstants.SKUD_SINGLE_PRICE;
		return totalSKUDPrice;

	}

	public Integer totalPriceofCD(Integer SKUC, Integer SKUD) {
		
		Integer totalSKUCDPrice = 0;           
		
		totalSKUCDPrice = (SKUC == SKUD) ? SKUC * EngineConstants.SKUC_WITH_SKUD_PROMO_PRICE : totalSKUCDPrice;
		totalSKUCDPrice = (SKUC > SKUD) ? ((SKUC - SKUD)*EngineConstants.SKUC_SINGLE_PRICE + SKUD*EngineConstants.SKUC_WITH_SKUD_PROMO_PRICE) : totalSKUCDPrice;
		totalSKUCDPrice = (SKUD > SKUC) ? ((SKUD - SKUC)*EngineConstants.SKUD_SINGLE_PRICE + SKUC*EngineConstants.SKUC_WITH_SKUD_PROMO_PRICE) : totalSKUCDPrice;
		
		return totalSKUCDPrice;

	}

}
