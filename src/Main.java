import ProgramLog.Programa;

import java.util.Random;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        boolean success=true;
//
//        Stack<ProgramLog.Programa> programStack=new Stack<ProgramLog.Programa>();
//        ProgramLog.Programa initP=new ProgramLog.Programa("prog 1");
//        System.out.println(initP.Nombre +" iniciado");
//        int numberOfPrograms=numberOfPrograms(false);
//
//        Process(numberOfPrograms,programStack,success);
//        GetExeLog(success,programStack, initP);
    }

    public static int numberOfPrograms(boolean sub){
        Random r= new Random();
        if(sub){
            return r.nextInt(3);
        }else{
            return r.nextInt(8);
        }
    }
    public static void subProcess(int numberOfSubprocesses, Stack<Programa> stack, boolean success){
        for(int j=0; j<=numberOfSubprocesses;j++){
            Programa sp= new Programa("proc"+ (numberOfPrograms(true)+1));
            System.out.println("\t\t"+sp.Nombre+" iniciado");
            stack.push(sp);
            if(sp.isSuccess()){
                stack.pop();
                System.out.println("\t\t"+sp.Nombre+" terminado");
            }else{
                System.err.println("\t\t"+sp.Nombre+" fallado");
                j=numberOfSubprocesses;
                success=false;
            }
        }
    }

    public static void Process(int numberOfPrograms, Stack<Programa> stack, boolean success){
        for (int i = 0; i <= numberOfPrograms; i++) {
            Programa p= new Programa("proc" + (numberOfPrograms(false)+1));
            System.out.println("\t"+p.Nombre+" iniciado");
            int numberOfSubprocesess= numberOfPrograms(true);
            subProcess(numberOfSubprocesess,stack, success);
            if (success){
                System.out.println("\t"+p.Nombre+" terminado");
            }
            else{
                stack.push(p);
                i=numberOfPrograms;
                System.err.println("\t"+p.Nombre+" fallado");
            }
        }
    }

    public static void GetExeLog(boolean success, Stack<Programa> stack, Programa p){
        String errorLog="";
        if(success){
            System.out.println(p.Nombre +" terminado");
            System.out.println("SUCCESSFUL");
        }
        else{
            stack.push(p);
            while(!stack.empty()){
                Programa failedProgram= stack.pop();
                errorLog=errorLog+failedProgram.Nombre+":";
            }
            System.err.println(p.Nombre +" fallado");

            System.err.println("ABORT ERROR "+errorLog);
        }
    }
}