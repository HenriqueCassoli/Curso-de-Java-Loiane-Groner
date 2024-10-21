package com.RelacionamentoentreClasses;

public class Teste {
    public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Cassoli");
       // contato.setEndereco("kings lans");
       // contato.setTelefone("11 92830283");

        //relacionamento tem-um endereco

        Endereco end = new Endereco();
        end.setNomeDarua("Rua game of thrones");
        end.setNumero("n/a");
        end.setCompleto("-");
        end.setCidade("kings lands");
        end.setEstado("westeros");
        end.setCep("99999");

        contato.setEndereco(end);

        //relacionamento tem-um telefone
         Telefone telefone = new Telefone();
         telefone.setTipo("celular");
         telefone.setDdd("11");
          telefone.setNumero("11 - 999999");

        Telefone telefone2 = new Telefone();
        telefone2.setTipo("casa");
        telefone2.setDdd("11");
        telefone2.setNumero("8888-88888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = telefone;
        telefones[1] = telefone2;

        //contato.setTelefone(telefone);
        contato.setTelefones(telefones);


        //teste de saida no controle
        System.out.println(contato.getNome());


        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

       /* if(contato != null && contato.getTelefone() != null){
           System.out.println(contato.getTelefone().getDdd() +" "+contato.getTelefone().getNumero());
        }*/

        if(contato != null && contato.getTelefones() != null){
            for(Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() +""+t.getNumero());
            }
        }
    }
}
