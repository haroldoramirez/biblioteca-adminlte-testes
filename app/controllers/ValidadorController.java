package controllers;

import play.mvc.Controller;

import java.text.Normalizer;

public class ValidadorController extends Controller {

    /**
     * metodo responsavel por modificar o titulo do arquivo
     *
     * @param str identificador
     * @return a string formatada
     */
    public String formatarTitulo(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "")
                .replaceAll(" ","-")
                .replaceAll(",", "-")
                .replaceAll("!", "")
                .replaceAll("/", "-")
                .replaceAll("[?]", "")
                .replaceAll("[%]", "")
                .replaceAll("[']", "")
                .replaceAll("[´]", "")
                .replaceAll("[`]", "")
                .replaceAll("[:]", "")
                .toLowerCase();
    }
}
