package com.example.demo;

import com.example.demo.db.model.Alapanyag;
import com.example.demo.db.model.Hozzavalo;
import com.example.demo.gyakorlas.Konyv;
import com.example.demo.gyakorlas.Polc;
import com.example.demo.repository.AlapanyagRepository;
import com.example.demo.repository.HozzavalokRepository;
import com.example.demo.repository.ReceptRepository;
import com.example.demo.service.KonyvtarService;
import com.example.demo.service.ReceptService;
import com.example.demo.service.ReceptServiceInterface;
import com.example.demo.view.model.AlapanyagView;
import com.example.demo.view.model.HozzavaloView;
import com.example.demo.view.model.ReceptView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class DemoApplication  implements CommandLineRunner {

	@Autowired
	private ReceptRepository receptRepository;

	@Autowired
	private HozzavalokRepository hozzavalokRepository;

	@Autowired
	private AlapanyagRepository alapanyagRepository;

	@Autowired
	private ReceptService receptService;

	@Autowired
	private KonyvtarService konyvtarService;



	//public static void main(String[] args) {
	//	SpringApplication.run(DemoApplication.class, args);

	//}

	@Override
	public void run(String...args) throws Exception {



		/*List<Hozzavalo> hozzavaloList= HozzavalokRepository.findAll();

		Alapanyag alapanyag = alapanyagRepository.findById(2);
		System.out.println(alapanyag.getNev());*/

		/*int darab =alapanyagRepository.deleteById(1);
		System.out.println(darab);

		int betuz = alapanyagRepository.insert("liszt",2);
		System.out.println(betuz);*/

		/*Recept recept = receptRepository.findById(1);
		System.out.println(recept.getNev());

		int darab = receptRepository.deleteById(4);
		System.out.println(darab);*/

		/*int betuz = alapanyagRepository.insert("csicseriborsó");
		System.out.println(betuz);

		int update = alapanyagRepository.update("finomliszt", 2);
		System.out.println(update);

		int update = receptRepository.update("csötészta", 5);
		System.out.println(update);*/

		/*AlapanyagView finomliszt = new AlapanyagView();
		finomliszt.setAzonosito(2);
		AlapanyagView cukor = new AlapanyagView();
		cukor.setAzonosito(3);

		ReceptView receptView = new ReceptView();
		receptView.setNev("slambuc");
		receptView.setLeiras("tészta meg ööööööööö..");

		HozzavaloView hozzavaloView = new HozzavaloView();
		hozzavaloView.setMennyiseg(40);
		hozzavaloView.setAlapanyagView(finomliszt);
		hozzavaloView.setReceptView(receptView);
		HozzavaloView hozzavaloView1 = new HozzavaloView();
		hozzavaloView1.setMennyiseg(18);
		hozzavaloView1.setAlapanyagView(cukor);
		hozzavaloView1.setReceptView(receptView);

		ArrayList<HozzavaloView> hozzavaloList = new ArrayList<>();
		hozzavaloList.add(hozzavaloView );
		hozzavaloList.add(hozzavaloView1 );

		receptView.setHozzavaloViews(hozzavaloList);

		receptService.save(receptView);*/


		Polc polc = new Polc();

		Konyv konyv1 = new Konyv();
		konyv1.setCim("A bárányok hallgatnak");
		konyv1.setOldalszam(1000);
		polc.getKonyvek().add(konyv1);

		Konyv konyv2 = new Konyv();
		konyv2.setCim("Brian élete");
		konyv2.setOldalszam(400);
		polc.getKonyvek().add(konyv2);

		Konyv konyv3 = new Konyv();
		konyv3.setCim("Háború és béke");
		konyv3.setOldalszam(4000);
		polc.getKonyvek().add(konyv3);

		Konyv konyv4 = new Konyv();
		konyv4.setCim("Szlovákia történelme");
		konyv4.setOldalszam(40);
		polc.getKonyvek().add(konyv4);

		//konyvtarService.konyvlista(polc);
		//konyvtarService.legrovidebbKonyv(polc);

		konyvtarService.legrovidebbKonyv(polc);

	}
}
