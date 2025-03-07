package cronapi;

import cronapi.CronapiMetaData;
import cronapi.ParamMetaData;


/**
 * Exemplo de plugin servidor ...
 *
 * @author Fábio Duarte Freitas
 * @version 1.0
 * @since 2025-03-07
 *
 */

@CronapiMetaData(categoryName = "Minhas Funções")
public class pluginServidorBlocoDeProgramacao {

	@CronapiMetaData(type = "function", name = "PluginServidor", description = "Exemplo de plugin servidor")
	public static String Example(@ParamMetaData(description = "Parâmetro: Descrição do parâmetro") String input) throws Exception {
		return "Input " + input;
	}

}