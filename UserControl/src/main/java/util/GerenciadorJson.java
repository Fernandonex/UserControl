package util;

import com.google.gson.Gson;

public class GerenciadorJson {

	
	public static String gerarJson(Object o) {
		Gson gson = new Gson();
		return gson.toJson(o, Object.class);
	}
	/*public static String converterDoJson(String json, @SuppressWarnings("rawtypes") Class T) {
		Gson gson = new Gson();
		return gson.fromJson(json, T.getClass());
	}*/
}
