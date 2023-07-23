package ru.dolya.Adapter;

public class MemoryCardToUSBAdapter implements USB {

    private final MemoryCard memoryCard;

    public MemoryCardToUSBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void input() {
        memoryCard.input();
    }
}
