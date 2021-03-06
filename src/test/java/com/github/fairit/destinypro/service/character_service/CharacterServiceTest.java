package com.github.fairit.destinypro.service.character_service;

import com.github.fairit.destinypro.dto.character.CharacterData;
import com.github.fairit.destinypro.service.player_service.PlayerApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CharacterServiceTest {

    @Autowired
    private PlayerApiService playerApi;

    @Autowired
    private CharacterService characterService;

    @Test
    public void getListOfPlayerCharacters() {

        List<CharacterData> characterDataList = characterService
                .getListOfPlayerCharacters(playerApi.findPlayerApiByNickname("katojido")).getCharacterDataList();

        assertThat(characterDataList, notNullValue());
        assertThat(characterDataList, everyItem(instanceOf(CharacterData.class)));
        assertThat(characterDataList, hasSize(both(greaterThan(0)).and(lessThanOrEqualTo(3))));
    }
}