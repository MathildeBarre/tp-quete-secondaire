package fr.epsi.stazi.jpahibernate.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.epsi.stazi.jpahibernate.model.Pokemon;

public class PokemonDao extends GenericDao {

	/**
	 * Insers a pokemon.
	 * @throws SQLException 
	 */
	public void insert(Pokemon pokemon) throws SQLException {
		// TODO:
	}

	/**
	 * Finds all pokemons.
	 * @return A list containing all the pokemons.
	 * @throws SQLException 
	 */
	public List<Pokemon> findAll() throws SQLException {
		List<Pokemon> allPokemons = new ArrayList<Pokemon>();
		
		// TODO:
		
		return allPokemons;
	}

	/**
	 * Finds a pokemon by its id.
	 * @return The matching pokemon, otherwise null.
	 * @throws SQLException 
	 */
	public Pokemon findById(long id) throws SQLException {
		Pokemon pokemon = null;
		
		// TODO:
		
		return pokemon;
	}

	/**
	 * Finds a pokemon by its number.
	 * @return The matching pokemon, otherwise null.
	 * @throws SQLException 
	 */
	public Pokemon findByNumber(int number) throws SQLException {
		Pokemon pokemon = null;
		
		// TODO:
		
		return pokemon;
	}
}
