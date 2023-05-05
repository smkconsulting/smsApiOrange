package com.nbouraoui.orangesmsapi;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nbouraoui.orangesmsapi.services.AccessTokenManager;
import com.nbouraoui.orangesmsapi.services.SmsManager;

@SpringBootApplication
public class OrangeSmsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrangeSmsApiApplication.class, args);
		AccessTokenManager accessTokenManager = new AccessTokenManager();
		String token = accessTokenManager.generateAccessToken("Basic N1ptZFdTY0NUM1VCZkg1SFEzZW0yNWdna3h0WElBbDA6a2s5NHpRZ2xZcVdCOGZiMQ==");
		//String test = accessTokenManager.generateAccessToken("Wgr5kPhqaR8GAAT9ygZHfwtneuAqAoD1","PcUc1sgmizhx5Bh9");
		String message ="EN CE 1ER MAI, JOUR MEMORABLE DE LA FETE DE TRAVAIL, LE RESAFIG SOUHAITE A TOUS LES VAILLANTS AGENTS DES FINANCES GENERALES UNE BONNE FETE DE TRAVAIL. TOUT EN SALUANT VOTRE INESTIMABLE CONTRIBUTION AU RAYONNEMENT DE L'ADMINISTRATION FINANCIERE, LE RESAFIG VOUDRAIT VOUS RASSURER QUE L'AMELIORATION DE NOS CONDITIONS DE TRAVAIL DEMEURE SA PRINCIPALE PRIORITE. POUR LE BEN LE SGA HERVE MOGNANY.";
		SmsManager smsManager = new SmsManager();
		JSONObject jsonObject1 =  smsManager.sendMessage("+2250000", "+2250709768110", message, token);
		JSONObject jsonObject2 =  smsManager.sendMessage("+2250000", "+2250584608700", message, token);
//		JSONObject jsonObject =  smsManager.viewSmsBalance("sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
//		JSONObject jsonObject =  smsManager.viewSmsUsage("sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
//		JSONObject jsonObject =  smsManager.viewSmsPurchaseHistory("sOhNAEJFyAcYLZ11lfFhYGsvhN0V");
		System.out.println(jsonObject1);
		System.out.println(jsonObject2);
//		System.out.println(test);

	}

}
