package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.DemoGuruPage;

public class DemoGuru99Stepdefinitions {

        DemoGuruPage demoGuruPage=new DemoGuruPage();

        @Given("user web sayfasinda")
        public void user_web_sayfasinda() {

        }
        @Given("{string}, sutunundaki tum degerleri yazdirir")
        public void sutunundaki_tum_degerleri_yazdirir(String string) {
}
}
