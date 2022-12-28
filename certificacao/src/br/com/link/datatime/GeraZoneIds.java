package br.com.link.datatime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class GeraZoneIds {
	public static void main(String[] args) {
		System.out.println("ZoneId do Sistema => " + ZoneId.systemDefault());
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for (String zoneId : zoneIds) {
			System.out.println(zoneId + " => " + LocalTime.now(ZoneId.of(zoneId)));
		}
	}
}
