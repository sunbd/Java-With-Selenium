package OOP2;

public class TestHospital {

	public static void main(String[] args) {
		
		ApolloHospital ap = new ApolloHospital();
		ap.emergency();
		ap.polioDrops();
		ap.bloodTest();
		
		ap.physioServices();
		ap.outPatient();
		ap.inpatient();
		
		ap.ambulanceServices();
		ap.cancerTreatment();
		
		System.out.println(IndiaHealthCare.min_fee);
		System.out.println(USHealthCare.min_fee_us);
		
		IndiaHealthCare ih = new ApolloHospital();
		
		ih.emergency();
		ih.polioDrops();
		ih.bloodTest();
		ih.dentalTest();
		

	}

}
