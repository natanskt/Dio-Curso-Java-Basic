public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatandoCep("50830610");

            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            System.out.println("Cep Invalido");
        }
        
    }

    static String formatandoCep (String cep) throws CepInvalido{
       if (cep.length()!= 8 ) {
        throw new CepInvalido ();
        
       }
    return cep;

    }
}
