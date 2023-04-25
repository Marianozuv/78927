package mx.uv.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@RequestMapping("/")
	public String name1() {
		return "hola mundo";
	}

	@RequestMapping("/adios")
	public String name2() {
		return "adios mundo";
	}

	@RequestMapping("/pregunta")
	public String name3() {
		return "como estas?";
	}

	@RequestMapping("/productos")
	public List<String> productos() {
		List<String> p = new ArrayList<String>();
		p.add("pambazos");
		p.add("tamales");
		p.add("refrescos");
		return p;
	}

	@RequestMapping("/productos2")
	public List<Productos> productos2() {
		List<Productos> lista= new ArrayList<Productos>();
		Productos p0 =new Productos("pambazos",10);
		lista.add(p0);
		Productos p1 =new Productos("refrescos",5);
		lista.add(p1);
		Productos p2 =new Productos("tamales",3);
		lista.add(p2);
		Productos p3 =new Productos("dulces",8);
		lista.add(p3);
		return lista;
	}

	//curl -i -X localhost:8080/get
	@RequestMapping ( value = "/get", method = RequestMethod.GET)
	public String saludarGet(){
		return "mensaje de tipo GET";
	}

	//curl -i -X POST localhost:8080
	@RequestMapping ( value = "/post", method = RequestMethod.POST)
	public String saludarPost(){
		return "mensaje de tipo POST";
	}


}
