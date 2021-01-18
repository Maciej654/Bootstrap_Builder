package pl.put.poznan.bootstrap.app;

public class Main {

    public static void main(String[] args){
        String[] argsB = {};
        if(args.length == 1){
            if(args[0].equalsIgnoreCase("rest")){
                BootstrapBuilderApplication.launch(argsB);
            }
            else if(args[0].equalsIgnoreCase("gui")){
                BootstrapBuilderJavafxApplication.launch(argsB);
            }
            else{
                System.out.println("Unknown  parameter '" + args[0] + "' provided.");
                System.out.println("Possible parameters: 'rest', 'gui'.");
            }
        }
        else {
            System.out.println("Wrong number (" + args.length + ") of parameters provided.");
            System.out.println("Shall be: 1.");
            System.out.println("Possible parameters: 'rest', 'gui'.");
        }
    }
}