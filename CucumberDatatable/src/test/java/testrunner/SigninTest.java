package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Java\\CucumberDatatable\\src\\test\\resources\\Feature\\demoddt.feature",glue= {"stepdefination"},
monochrome=true,
plugin= {"pretty","html:target/HtmlFile/index.html"})
public class SigninTest {

}
