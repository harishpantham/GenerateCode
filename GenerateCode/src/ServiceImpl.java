
public class ServiceImpl {

		public static void main(String args[]) {
			String response = "OffersResponse";
			String sresponse = "offersResponse";
			String entity = "Product";
			String sentity = "product";
			
			System.out.println("public class "+entity+"ServiceImpl implements "+entity+"ServiceI{\r\n" + 
					"	\r\n" + 
					"	@Autowired\r\n" + 
					"	"+entity+"Repository "+sentity+"Repository;\r\n" + 
					"	\r\n" + 
					"	@Autowired\r\n" + 
					"	Messages messageService;\r\n" + 
					"\r\n" + 
					"	@Override\r\n" + 
					"	public "+response+" getAll"+entity+"s() {\r\n" + 
					"\r\n" + 
					"		List<"+entity+"> "+sentity+"List = "+sentity+"Repository.findAll();\r\n" + 
					"		"+response+" "+sresponse+" = new "+response+"();\r\n" + 
					"		if(!StringUtils.isEmpty("+sentity+"List)) {\r\n" + 
					"			List<"+entity+"DTO> "+sentity+"DTOList = get"+entity+"DTOList("+sentity+"List);\r\n" + 
					"			"+sresponse+".setMessage(messageService.getMessage(\"success.message\"));\r\n" + 
					"			"+sresponse+".setStatus(HttpStatus.OK.value());\r\n" + 
					"			"+sresponse+".setPayLoad("+sentity+"DTOList);\r\n" + 
					"			return "+sresponse+";\r\n" + 
					"		}\r\n" + 
					"		else {\r\n" + 
					"			"+sresponse+".setMessage(messageService.getMessage(\""+sentity+".no\"));\r\n" + 
					"			"+sresponse+".setStatus(HttpStatus.OK.value());\r\n" + 
					"			return "+sresponse+";\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	private List<"+entity+"DTO> get"+entity+"DTOList(List<"+entity+"> "+sentity+"List) {\r\n" + 
					"		List<"+entity+"DTO> "+sentity+"DTOList = new ArrayList<>();\r\n" + 
					"		for("+entity+" "+sentity+" : "+sentity+"List) {\r\n" + 
					"			"+entity+"DTO "+sentity+"DTO = new "+entity+"DTO();\r\n" + 
					"			"+sentity+"DTO.set"+entity+"Id("+sentity+".get"+entity+"Id());\r\n" + 
					"			"+sentity+"DTO.set"+entity+"Name("+sentity+".get"+entity+"Name());\r\n" + 
					"			"+sentity+"DTO.setPassword("+sentity+".getPassword());\r\n" + 
					"			"+sentity+"DTO.setRole("+sentity+".getRole());\r\n" + 
					"           "+sentity+"DTOList.add("+sentity+"DTO);\r\n"+
					"		}\r\n" + 
					"		return "+sentity+"DTOList;\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	@Override\r\n" + 
					"	public "+response+" get"+entity+"ById(Long "+sentity+"Id) {\r\n" + 
					"		"+response+" "+sresponse+" = new "+response+"();\r\n" + 
					"		if(!StringUtils.isEmpty("+sentity+"Id)) {\r\n" + 
					"			Optional<"+entity+"> optional"+entity+" = "+sentity+"Repository.findById("+sentity+"Id);\r\n" + 
					"			if(optional"+entity+".isPresent()) {\r\n" + 
					"				List<"+entity+"> "+sentity+"List = new ArrayList<>();\r\n" + 
					"				"+entity+" "+sentity+" = optional"+entity+".get();\r\n" + 
					"				"+sentity+"List.add("+sentity+");\r\n" + 
					"				List<"+entity+"DTO> "+sentity+"DTOList = get"+entity+"DTOList("+sentity+"List);\r\n" + 
					"				"+sresponse+".setMessage(\"success.message\");\r\n" + 
					"				"+sresponse+".setStatus(HttpStatus.OK.value());\r\n" + 
					"				"+sresponse+".setPayLoad("+sentity+"DTOList);\r\n" + 
					"			}\r\n" + 
					"			else {\r\n" + 
					"				"+sresponse+".setMessage(messageService.getMessage(\""+sentity+".no\"));\r\n" + 
					"				"+sresponse+".setStatus(HttpStatus.OK.value());\r\n" + 
					"			}\r\n" + 
					"		}\r\n" + 
					"		else {\r\n" + 
					"			"+sresponse+".setMessage(messageService.getMessage(\"invalid.data\"));\r\n" + 
					"			"+sresponse+".setStatus(HttpStatus.BAD_REQUEST.value());\r\n" + 
					"		}\r\n" + 
					"		\r\n" + 
					"		return "+sresponse+";\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	@Override\r\n" + 
					"	public "+response+" save"+entity+"("+entity+"DTO "+sentity+"DTO) {\r\n" + 
					"		"+response+" "+sresponse+" = new "+response+"();\r\n" + 
					"		if("+sentity+"DTO != null) {\r\n" + 
					"			"+entity+" "+sentity+" = new "+entity+"();\r\n" + 
					"			"+sentity+" = get"+entity+"("+sentity+"DTO,"+sentity+");\r\n" + 
					"			"+sentity+"Repository.save("+sentity+");\r\n" + 
					"			"+sresponse+".setStatus(HttpStatus.OK.value());\r\n" + 
					"			"+sresponse+".setMessage(messageService.getMessage(\""+sentity+".save\"));\r\n" + 
					"		}\r\n" + 
					"		else {\r\n" + 
					"			"+sresponse+".setStatus(HttpStatus.BAD_REQUEST.value());\r\n" + 
					"			"+sresponse+".setMessage(messageService.getMessage(\"invalid.data\"));\r\n" + 
					"		}\r\n" + 
					"		return null;\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	@Override\r\n" + 
					"	public "+response+" update"+entity+"("+entity+"DTO "+sentity+"DTO) {\r\n" + 
					"		"+response+" "+sresponse+" = new "+response+"();\r\n" + 
					"		if("+sentity+"DTO !=null) {\r\n" + 
					"			Optional<"+entity+"> optional"+entity+" = "+sentity+"Repository.findById("+sentity+"DTO.get"+entity+"Id());\r\n" + 
					"			if(optional"+entity+".isPresent()) {\r\n" + 
					"				"+entity+" "+sentity+" = get"+entity+"("+sentity+"DTO, optional"+entity+".get());\r\n" + 
					"			    "+sentity+"Repository.save("+sentity+");\r\n" + 
					"			    "+sresponse+".setStatus(HttpStatus.OK.value());\r\n" + 
					"			    "+sresponse+".setMessage(messageService.getMessage(\""+sentity+".update\"));\r\n" + 
					"			}\r\n" + 
					"			else {\r\n" + 
					"				"+sresponse+".setStatus(HttpStatus.NOT_FOUND.value());\r\n" + 
					"				"+sresponse+".setMessage(messageService.getMessage(\""+sentity+".not.found\"));\r\n" + 
					"			}\r\n" + 
					"		}\r\n" + 
					"		else {\r\n" + 
					"			"+sresponse+".setStatus(HttpStatus.BAD_REQUEST.value());\r\n" + 
					"			"+sresponse+".setMessage(messageService.getMessage(\"invalid.data\"));\r\n" + 
					"		}\r\n" + 
					"		return "+sresponse+";\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	private "+entity+" get"+entity+"("+entity+"DTO "+sentity+"DTO, "+entity+" "+sentity+") {\r\n" + 
					"\r\n" + 
					"		if(!StringUtils.isEmpty("+sentity+"DTO.get"+entity+"Name())) {\r\n" + 
					"			"+sentity+".set"+entity+"Name("+sentity+"DTO.get"+entity+"Name());\r\n" + 
					"		}\r\n" + 
					"		if(!StringUtils.isEmpty("+sentity+"DTO.getPassword())) {\r\n" + 
					"			"+sentity+".setPassword("+sentity+"DTO.getPassword());\r\n" + 
					"		}\r\n" + 
					"		return "+sentity+";\r\n" + 
					"	}\r\n" + 
					"\r\n" + 
					"	@Override\r\n" + 
					"	public "+response+" delete"+entity+"(Long "+sentity+"Id) {\r\n" + 
					"		"+response+" "+sresponse+" = new "+response+"();\r\n" + 
					"		"+sentity+"Repository.deleteById("+sentity+"Id);\r\n" + 
					"		"+sresponse+".setMessage(messageService.getMessage(\""+sentity+".update\"));\r\n" + 
					"		return "+sresponse+";\r\n" + 
					"	}\r\n" + 
					"	\r\n" + 
					"}\r\n" + 
					"");

		}
	}


