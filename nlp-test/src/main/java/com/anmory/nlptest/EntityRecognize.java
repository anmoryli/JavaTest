package com.anmory.nlptest;

import edu.stanford.nlp.ie.machinereading.structure.EntityMention;
import edu.stanford.nlp.simple.*;

/**
 * @author Anmory/李梦杰
 * @description TODO
 * @date 2025-04-03 下午9:31
 */

public class EntityRecognize {
    public static void main(String[] args) {
        String text = "Barack Obama was born in Hawaii.";

        Document doc = new Document(text);
        for (Sentence sent : doc.sentences()) {
            for (EntityMention em : sent.entityMentions()) {
                System.out.println(em.text() + ": " + em.entityType());
            }
        }
    }
}
