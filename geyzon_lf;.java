package Teste;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PreenchoFormulario {

    WebDriver driver;

    @Before // tudo que for colocado aqui nessa classe será executado antes de cada teste.
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\driver-navegadores/chromedriver.exe"); // O caminho é onde está localizado o driver usado
        driver = new ChromeDriver(); // Para a variável, vamos atribuir um variável, atribuindo uma nova instância de variável. Nessa linha, estamos abrindo o Chrome
        driver.manage().window().maximize(); // Aqui, garantimos que a janela seja maximizada ao abrir
        driver.get("https://forms.liferay.com/web/forms/shared/-/form/122548" // Aqui colocamos a URL do formulário que vamos testar
        driver.manage().timeouts()implicityWait(10, TimeUit.SECONDS); // Aqui será realizada a cada 1 segundo uma tentativa, até 10 segundos. Totalizando 10 segundos e não for encontrado nada, vai dar erro por timeout
        
    }

    @After
    public void tearDown() throws Exception {
			driver.quit();
    }

    @Test
    public void test() {
        driver.findElement(By.name("user[name=_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$WhatIsYourName$TVfjgnYF$0$$en_US]")).sendKeys("Richarlison"); //Usamos o findElment para interagir com o elemento para encontrá-lo na página
				driver.findElement(By.name("user[name=_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$WhyDidYouJoinTheTestingArea$GcZZPxJg$0$$en_US]")).sendKeys("Pelo meu perfil curioso e investigativo"); //Escrevemos uma chave de texto
				driver.findElement(By.name("user(name=_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$WhatIsTheDateOfYourBirth$04EQKSuY$0$$en_US")).sendKeys(01/01/2006);

				String favoriteSoccer = driver.findElement("user[name=_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$WhatIsYourName$TVfjgnYF$0$$en_US]")).getAttribute("value") //  Temos uma variável que está recebendo um atributo chamado Value, esse value é o valor que a gente passa no atributo quando escrevemos algo no campo 
				String testingArea = driver.findElement(By.name("user[name=_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$WhyDidYouJoinTheTestingArea$GcZZPxJg$0$$en_US]")).getAttribute("value")
				String foundData = driver.findElement("user(name=_com_liferay_dynamic_data_mapping_form_web_portlet_DDMFormPortlet_ddm$$WhatIsTheDateOfYourBirth$04EQKSuY$0$$en_US")).getAttribute("value").getAttribute("value")		
				
				assertEquals("Richarlison", favoriteSoccer); //Validamos se os valores inseridos retornam igual
				assertEquals("Pelo meu perfil curioso e investigativo", testingArea);
				assertEquals("01/01/2006", foundData);

				webElement singup = driver.findElement(Byxpath("//div(@id='ddm-form-submit']")); submit.click(); //aqui performamos a ação de clcikar para submeter o formulário
}