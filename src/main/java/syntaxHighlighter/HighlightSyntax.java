package syntaxHighlighter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

/**
 * Created by Lenovo on 10/8/2017.
 */
public class HighlightSyntax {
	
    static String output ="If we write a program and compile it, then as we run the program, we will get output";

    public static void main(String[] args) {
        
        String input = "If we write a program and compile it, then as we run the program, we will get output";
        
        List<Keyword> keywordsList = Arrays.asList(new Keyword("as", "[blue]", "", ""),
                new Keyword("if", "[blue]", "", ""),
                new Keyword("and", "[blue]", "", ""),
                new Keyword("then", "[blue]", "", ""),
                new Keyword("when", "[blue]", "", ""));
        
        List<Keyword> keywordsList1 = Arrays.asList(new Keyword("as", "[blue]", "", ""),
                new Keyword("if", "[red]", "", ""),
                new Keyword("and", "[red]", "", ""),
                new Keyword("then", "[green]", "", ""),
                new Keyword("when", "[blue]", "", ""));

        List<Keyword> keywordsList2 = Arrays.asList(new Keyword("as", "[blue]", "capital", ""),
                new Keyword("if", "[red]", "lower", ""),
                new Keyword("and", "[red]", "capital", ""),
                new Keyword("then", "[green]", "lower", ""),
                new Keyword("when", "[blue]", "lower", ""));
        
        List<Keyword> keywordsList3 = Arrays.asList(new Keyword("as", "[blue]", "capital", "[normal]"),
                new Keyword("if", "[red]", "lower", "[bold]"),
                new Keyword("and", "[red]", "capital", "[bold]"),
                new Keyword("then", "[green]", "lower", "[normal]"),
                new Keyword("when", "[blue]", "lower", "[normal]"));
        
        
        printSampleOutput(keywordsList, input);
        printSampleOutput(keywordsList1, input);
        printSampleOutput(keywordsList2, input);
        printSampleOutput(keywordsList3, input);

    }
    
    public static void printSampleOutput(List<Keyword> keywordsList, String inputSample)
    {
		keywordsList.stream().forEach((i) -> {
			if ((inputSample).contains(i.getName())) {
				if(i.getCapitalization().equals("capital"))
				{
					output = output.replaceAll(i.getName(), i.getColor() + i.getStyle() + i.getName().toUpperCase() + i.getStyle() +i.getColor());
				}
				else{
				output = output.replaceAll(i.getName(), i.getColor() + i.getStyle() + i.getName().toLowerCase() + i.getStyle() +i.getColor());
				}
			}
		});
		
		System.out.println(output);
		output ="If we write a program and compile it, then as we run the program, we will get output";
    }

}
