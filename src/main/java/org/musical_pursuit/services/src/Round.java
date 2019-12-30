package org.musical_pursuit.services.src;

import org.musical_pursuit.services.src.PlayCardPackage.IPlayCard;

import java.util.Iterator;

public class Round implements Iterable<IPlayCard> {
    /**
     * Round class contains array of question to be ask
     */
    private IPlayCard[] questions;

    public Round(IPlayCard[] questions) {
        this.questions = questions;
    }

    @Override
    public Iterator<IPlayCard> iterator() {
        return new Iterator<IPlayCard>() {
            int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < questions.length &&
                        questions[pos] != null;
            }

            @Override
            public IPlayCard next() {
                IPlayCard playCard = questions[pos];
                pos += 1;
                return playCard;
            }
        };
    }
}
