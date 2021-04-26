package aprendendocucumber.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.core.gherkin.messages.internal.gherkin.internal.com.eclipsesource.json.ParseException;
import io.cucumber.cucumberexpressions.Transformer;

public class DateConverterAula15 implements Transformer<Date> {

	@Override
	public Date transform(String value) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date retorno = format.parse(value);
			return retorno;
		} catch (ParseException | java.text.ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}