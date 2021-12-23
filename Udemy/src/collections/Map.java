package collections;

import java.util.HashMap;
import java.util.Map.Entry;
public class Map {
	public static void main(String[] args) {
		
		HashMap<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1,"Roberto");
		usuarios.put(2,"Ricardo");
		usuarios.put(3,"Rafaela");
		usuarios.put(4, "Rebecca");

		System.out.println(usuarios.size());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Rebecca"));
		
		System.out.println(usuarios.get(1));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor:usuarios.values()){
			System.out.println(valor);
		}
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(4));
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
			
		}
	}

}
