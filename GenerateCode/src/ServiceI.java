
public class ServiceI {
	
	public static void main(String args[]) {
		String entity = "Role";
		String sentity = entity.toLowerCase();
		String semicolon =";";
		
		String subinterface1 = "getAll"+entity+"s()"+semicolon;
		String subinterface2 = "get"+entity+"ById(Long "+" "+sentity+"Id)"+semicolon;
		String subinterface3 = "save"+entity+"("+entity+"DTO"+" "+sentity+"DTO"+")"+semicolon;
		String subinterface4 = "update"+entity+"("+entity+"DTO"+" "+sentity+"DTO"+")"+semicolon;
		String subinterface5 = "delete"+entity+"(Long "+" "+sentity+"Id)"+semicolon;
		
		/*String interface1 = "List<"+entity+"> "+ subinterface1;
		String interface2 = "Optional<"+entity+"> "+subinterface2;
		String interface3 = entity+" "+subinterface3;
		String interface4 = entity+" "+subinterface4;
		String interface5 = "void"+" "+subinterface5;*/
		
		String interface1 ="OffersResponse"+" "+subinterface1;
		String interface2 ="OffersResponse"+" "+subinterface2;
		String interface3 ="OffersResponse"+" "+subinterface3;
		String interface4 ="OffersResponse"+" "+subinterface4;
		String interface5 ="OffersResponse"+" "+subinterface5;
		
        System.out.println(interface1);				
        System.out.println(interface2);			
        System.out.println(interface3);			
        System.out.println(interface4);			
        System.out.println(interface5);	
	}

}
