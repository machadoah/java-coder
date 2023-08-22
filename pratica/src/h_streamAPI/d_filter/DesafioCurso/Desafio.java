package h_streamAPI.d_filter.DesafioCurso;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {

	public static void main(String[] args) {

		// Selecionar os produtos com desconto maior de 30%

		// produtos com frete gratis!

		// SUPERPROMOÇÃO

		Produto p1 = new Produto("Notebook Samsung Book 360", 6900.90, 0.1, true);
		Produto p2 = new Produto("Notebook Huawei MateBook X", 8600, 0.3, true);
		Produto p3 = new Produto("Macbook Pro M2", 17000.90, 0.05, true);
		Produto p4 = new Produto("Notebook Asus VivoBook", 3200.90, 0.1, false);
		Produto p5 = new Produto("Macbook Air 2020", 6600.90, 0.3, true);

		List<Produto> notebooks = Arrays.asList(p1, p2, p3, p4, p5);
		
		Predicate<Produto> desconto = p -> p.desconto >= 0.3;
		
		Predicate<Produto> frete = p -> p.freteGratis == true;
		
		Function<Produto, String> promocao = p -> "Super Promocao >> " + p.nome + " << Super Promocao";
		
		notebooks.stream().filter(desconto).filter(frete).map(promocao).forEach(System.out::println);
	}

}
