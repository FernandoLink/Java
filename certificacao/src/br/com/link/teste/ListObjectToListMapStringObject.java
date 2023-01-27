package br.com.link.teste;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListObjectToListMapStringObject {
	public static void main(String[] args) {
		
		EntradaAgendaFaturamento eaf1 = new EntradaAgendaFaturamento("1", "1", "01-01-2022");
		EntradaAgendaFaturamento eaf2 = new EntradaAgendaFaturamento("2", "2", "01-02-2022");
		
		List<EntradaAgendaFaturamento> leaf = new LinkedList<EntradaAgendaFaturamento>();
		leaf.add(eaf1);
		leaf.add(eaf2);
		
		System.out.println(leaf.toString());
		System.out.println(leaf.get(0).getEtapa());
		System.out.println(leaf.get(0).getEvenFat());
		System.out.println(leaf.get(0).getDataPrevista());
		
		Map<String, Object> mso = new HashMap<>();
		mso.put(leaf.get(0).getEtapa(), leaf.get(0).getDataPrevista());
		
		List<Map<String, Object>> lmso = new ArrayList<>();
		lmso.add(mso);
		System.out.println(lmso);
		
		
	}
}