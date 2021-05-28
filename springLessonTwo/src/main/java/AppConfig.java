import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;





        @Configuration
        public class AppConfig {
            @Bean(name = "idoctor")
            public IDoctor iDoctor(){
                return new Neurologist();
            }
            @Bean(name = "clinic"){

            }

        }
/*        @Bean(name= "iDoctor")
            public IDoctor iDoctor(){
                return new Therapist();
        }

        @Bean(name= "clinic"){
            public Clinic clinic(IDoctor iDoctor){
                Clinic clinic = new Clinic();
                clinic.guidePatient(IDoctor);
                return clinic;

            }

        }*/

