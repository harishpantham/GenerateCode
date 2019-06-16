
public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String entity = "Product";
		String sentity = entity.toLowerCase();
		String semicolon =";";
		
		String subinterface1 = "getAll"+entity+"s()"+semicolon;
		String subinterface2 = "get"+entity+"ById(Long "+" "+sentity+"Id)"+semicolon;
		String subinterface3 = "save"+entity+"("+entity+"DTO"+" "+sentity+"DTO"+")"+semicolon;
		String subinterface4 = "update"+entity+"("+entity+"DTO"+" "+sentity+"DTO"+")"+semicolon;
		String subinterface5 = "delete"+entity+"(Long "+" "+sentity+"Id)"+semicolon;
		
		
/*		
		String interface1 ="OffersResponse"+" "+subinterface1;
		String interface2 ="OffersResponse"+" "+subinterface2;
		String interface3 ="OffersResponse"+" "+subinterface3;
		String interface4 ="OffersResponse"+" "+subinterface4;
		String interface5 ="OffersResponse"+" "+subinterface5;
		
System.out.println(interface1);				
System.out.println(interface2);			
System.out.println(interface3);			
System.out.println(interface4);			
System.out.println(interface5);	*/		

/*System.out.println("import org.springframework.beans.factory.annotation.Autowired;\r\n" + 
		"import org.springframework.web.bind.annotation.DeleteMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.GetMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.PathVariable;\r\n" + 
		"import org.springframework.web.bind.annotation.PostMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.PutMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.RequestBody;\r\n" + 
		"import org.springframework.web.bind.annotation.RequestMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.RestController;\r\n"+
		
		"@RestController()\r\n" + 
		"@RequestMapping(\"api\")\r\n" + 
		"public class "+entity+"Controller {\r\n" + 
		"\r\n" + 
		"    @Autowired\r\n" + 
		"    "+entity+"ServiceI "+sentity+"ServiceI;\r\n" + 
		"\r\n" + 
		"    @GetMapping(\"/"+sentity+"s"+"\")\r\n" + 
		"    public "+"OffersResponse"+" "+"getAll"+entity+"s()"+" {\r\n" + 
		"        return "+sentity+"ServiceI.getAll"+entity+"s"+";"+"\r\n" +
		"    }\r\n" + 
		"\r\n" + 
		"    @GetMapping(\"/"+sentity+"s/{"+sentity+"Id}\")\r\n" + 
		"    public "+"OffersResponse"+" get"+entity+"ById(@PathVariable Long "+sentity+"Id) {\r\n" + 
		"        return "+sentity+"ServiceI.get"+entity+"ById("+sentity+"Id)"+";"+"\r\n" + 
		"    }\r\n" + 
		"\r\n" + 
		"    @PostMapping(\"/"+sentity+"s\")\r\n" + 
		"    public "+"OffersResponse"+" save"+entity+"(@RequestBody "+entity+"DTO "+sentity+"DTO) {\r\n" + 
		"        return "+sentity+"ServiceI.save"+entity+"("+sentity+"DTO)"+";"+"\r\n" + 
		"    }\r\n" + 
		"\r\n" + 
		"    @PutMapping(\"/"+sentity+"s\")\r\n" +
		"    public "+"OffersResponse"+" update"+entity+"(@RequestBody "+entity+"DTO "+sentity+"DTO) {\r\n" + 
		"        return "+sentity+"ServiceI.update"+entity+"("+sentity+"DTO)"+";"+"\r\n" + 
		"    }\r\n" + 
		"\r\n" + 
		"    @DeleteMapping(\"/"+sentity+"s/{"+sentity+"Id}\")\r\n" + 
		"    public void delete"+entity+"(@PathVariable Long "+sentity+"Id) {\r\n" + 
		"        return "+sentity+"ServiceI.delete"+entity+"("+sentity+"Id)"+";"+"\r\n" + 
		"    }\r\n" + 
		"}");*/

/******************to return the values in List type use following like List<User>**********************/

String interface1 = "List<"+entity+"> "+ subinterface1;
String interface2 = "Optional<"+entity+"> "+subinterface2;
String interface3 = entity+" "+subinterface3;
String interface4 = entity+" "+subinterface4;
String interface5 = "void"+" "+subinterface5;
System.out.println("import org.springframework.beans.factory.annotation.Autowired;\r\n" + 
		"import org.springframework.web.bind.annotation.DeleteMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.GetMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.PathVariable;\r\n" + 
		"import org.springframework.web.bind.annotation.PostMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.PutMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.RequestBody;\r\n" + 
		"import org.springframework.web.bind.annotation.RequestMapping;\r\n" + 
		"import org.springframework.web.bind.annotation.RestController;\r\n"+
		
		"@RestController()\r\n" + 
		"@RequestMapping(\"api\")\r\n" + 
		"public class "+entity+"Controller {\r\n" + 
		"\r\n" + 
		"    @Autowired\r\n" + 
		"    "+entity+"ServiceI "+sentity+"ServiceI;\r\n" + 
		"\r\n" + 
		"    @GetMapping(\"/"+sentity+"s"+"\")\r\n" + 
		"    public "+"List<"+entity+"> "+" "+subinterface1+" {\r\n" + 
		"        return "+sentity+"ServiceI."+subinterface1+";"+"\r\n" +
		"    }\r\n" + 
		"\r\n" + 
		"    @GetMapping(\"/"+sentity+"s/{"+sentity+"Id}\")\r\n" + 
		"    public "+"Optional<"+entity+"> "+" get"+entity+"ById(@PathVariable Long "+sentity+"Id) {\r\n" + 
		"        return "+sentity+"ServiceI.get"+entity+"ById("+sentity+"Id)"+";"+"\r\n" + 
		"    }\r\n" + 
		"\r\n" + 
		"    @PostMapping(\"/"+sentity+"s\")\r\n" + 
		"    public "+entity+" save"+entity+"(@RequestBody "+entity+"DTO "+sentity+"DTO) {\r\n" + 
		"        return "+sentity+"ServiceI.save"+entity+"("+sentity+"DTO)"+";"+"\r\n" + 
		"    }\r\n" + 
		"\r\n" + 
		"    @PutMapping(\"/"+sentity+"s/{"+sentity+"Id}\")\r\n" + 
		"    public "+entity+" update"+entity+"(@RequestBody "+entity+"DTO "+sentity+"DTO) {\r\n" + 
		"        return "+sentity+"ServiceI.update"+entity+"("+sentity+"DTO)"+";"+"\r\n" + 
		"    }\r\n" + 
		"\r\n" + 
		"    @DeleteMapping(\"/"+sentity+"s/{"+sentity+"Id}\")\r\n" + 
		"    public void delete"+entity+"(@PathVariable Long "+sentity+"Id) {\r\n" + 
		"        return "+sentity+"ServiceI.delete"+entity+"("+sentity+"Id)"+";"+"\r\n" + 
		"    }\r\n" + 
		"}");

}
	}


