package runnerfile;

public class ConfigFileReader {
	
	public String getReportConfigPath(){
		String reportConfigPath = "C:\\Users\\Srikanth\\eclipse-workspace\\TestAssurePro\\extent-config.xml";
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in  file");		
	}
	

	
}
