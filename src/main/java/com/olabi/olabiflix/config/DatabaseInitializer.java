package com.olabi.olabiflix.config;

import com.olabi.olabiflix.model.entity.Filme;
import com.olabi.olabiflix.repository.FilmeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DatabaseInitializer implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(
            DatabaseInitializer.class);

    private final FilmeRepository filmeRepository;

    public DatabaseInitializer(FilmeRepository filmeRepository){
        this.filmeRepository = filmeRepository;
    }

    public static final List<Filme> filmes = List.of(
          new Filme("O Fabuloso Destino de Amelie Poulain", "2201", "PG-13", "29 Fev 2002", "1h43 min", "Comédia, Romance", "Jean-Pierre Jeunet", "Jean-Pierre Jeunet", "Audrey tautour, Mathieu Kassovitz, Lorella Cravotta, André Dussollier ", "Amélie é uma jovem do interior que se muda para Paris e logo começa a trabalhar em um café.", "Inglês, Francês", "França", "1 vitórias e 09 indicações."),
            new Filme("Avatar", "2009", "PG-13", "18 Dez 2009", "162 min", "Ação, Aventura, Fantasia, Ficção Científica", "James Cameron", "James Cameron", "Sam Worthington, Zoe Saldana, Sigourney Weaver, Stephen Lang", "Um fuzileiro paraplégico enviado à lua Pandora em uma missão única fica dividido entre seguir suas ordens e proteger o mundo que sente ser sua casa.", "Inglês, Espanhol", "EUA", "Ganhou 3 Oscars. Outros 86 vitórias e 129 indicações."),
            new Filme("A Origem", "2010", "PG-13", "16 Jul 2010", "148 min", "Ação, Aventura, Ficção Científica, Suspense", "Christopher Nolan", "Christopher Nolan", "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page, Tom Hardy", "Um ladrão que rouba segredos corporativos usando a tecnologia de compartilhamento de sonhos é dado a tarefa inversa de plantar uma ideia na mente de um C.E.O.", "Inglês, Japonês, Francês", "EUA, Reino Unido", "Ganhou 4 Oscars. Outros 152 vitórias e 217 indicações."),
            new Filme("Procurando Nemo", "2003", "PG", "04 jul 2003", "1h53 min", "Animação, Aventura", "Andrew Stanton", "Andrew Stanton,  Bob Peterson, Lee Unkrich, David Reynolds", "Andrew Stanton, Alexander Gould, Albert Brooks, Ellen De Geners", "Nemo é capturado por um mergulhador e acaba no aquário de um dentista.", "Inglês, Espanhol", "EUA", "Ganhou Oscar de melhor filme e outros prêmios."),
            new Filme("A Vida Secreta das Abelhas", "2008", "PG-13", "17 Out 2008", "1h45 min", "Drama, Obra de época", "Gina Prince-Bythewood", "Baseado no livro The Secret life of bees, Sue Monk Kidd", "Queen Latifah, Alicia Keys, Jennifer Hudson, Dakota Fanning", "Lily, uma menina de 14 anos, foge com sua amiga e enfermeira Rosaleen para uma pequena cidade da Carolina do Sul, que guarda respostas do passado de sua mãe. ", "Inglês", "EUA", "5 indicações."),
            new Filme("Besouro", "2009", "N/A", "30 Out 2009", "95 min", "Ação", "João Daniel Tikhomiroff", "Patrícia Andrade", "Adriana Alves, Sérgio Laurentino, Chris Viana, miguel Lunardi", "Bahia, década de 20. No interior os negros continuavam sendo tratados como escravos, apesar da abolição da escravatura ter ocorrido décadas antes.", "Português", "Brasil", "2 indicações & 1 vitória."),
            new Filme("Corra, Lola, Corra", "1999", "N/A", "12 Nov 1999", "1h25 min", "Comédia, Drama", "Tom Tykwer", "Tom Tykwer, Franka potente", "Franka Potente, Moritz Bleibtreu, Sebastian Schipper, Nina Petri, Joachim Król", " A cada passo, os segundos escapam, e as minúsculas decisões que ela toma podem fazer toda a diferença.", "Inglês", "EUA", "Ganhou prêmio de Cinema Alemão de Melhopr Filme."),
            new Filme("Planeta dos Macacos", "1968", "G", "03 Abr 1968", "112 min", "Aventura, Drama, Ficção Científica", "Franklin J. Schaffner", "Michael Wilson, Rod Serling", "Charlton Heston, Roddy McDowall, Kim Hunter", "Um astronauta cai em um planeta distante dominado por uma civilização de macacos que tratam os humanos como escravos.", "Inglês", "EUA", "Ganhou 1 Oscar. Outros 3 vitórias e 2 indicações."),
            new Filme("O Show de Truman", "1998", "PG", "05 Jun 1998", "103 min", "Comédia, Drama, Ficção Científica", "Peter Weir", "Andrew Niccol", "Jim Carrey, Laura Linney, Noah Emmerich, Natascha McElhone", "Um vendedor de seguros descobre que sua vida inteira é, na verdade, um programa de TV.", "Inglês", "EUA", "Indicado a 3 Oscars. Outros 40 vitórias e 66 indicações.")
    );
    @Override
    public  void run(String... args) throws Exception {
        log.info("Alô pepe moreno? o banco ta conectado");
        filmeRepository.saveAll(filmes);
        filmeRepository.findAll().forEach(filme -> System.out.println(filme));
    }

}
