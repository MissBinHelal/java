public class PokemonTest {
    public static void main(String[] args) {

        Pokedex p  = new Pokedex();
        Pokemon Pokemon1 = p.createPokemon("Pokemon1", 100, "animal");
        Pokemon Pokemon2 = p.createPokemon("Pokemon2", 60, "animal");
        Pokemon1.attackPokemon(Pokemon2);
        System.out.println(p.pokemonInfo(Pokemon1));
        System.out.println(p.pokemonInfo(Pokemon2));
      //  b.listPokemons();
    }
}