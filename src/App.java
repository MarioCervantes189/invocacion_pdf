import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        Lineas lineas = new Lineas();
        Lineas index = new Lineas();
        Input input = new Input();

        File file = new File("harry-potter-5.pdf");
        LectorPDF lector = new LectorPDF(index, file);
        Alphabetizer alphabetizer = new Alphabetizer();
        Output output = new Output();
        lineas.agregarEscuchador(lector);
        lineas.agregarEscuchador(alphabetizer);

        try{
            input.readFile(lineas, new File("input.txt"));
            output.writeFile(index, new File("output.txt"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
