public class PlanoOperadora    {

    public static void main(String[] args) {
        String plano = "T";

        switch (plano) {
            case "T" : {
                System.out.println("5Gb Youtube");
                break;}

            case "M" : {
                System.out.println("WhatsApp e Instagram gratis");
                break;}

            case "B" : {
                System.out.println("100 minutos de ligações");
                }
                break;
            
            default:
            System.out.println("Plano inválido");
            break;
    }
}
}