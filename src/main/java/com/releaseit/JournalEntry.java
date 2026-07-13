package com.releaseit;

import jakarta.persistence.*;

@Entity
@Table(name = "journal_entries")
public class JournalEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "entry_ID")
    private Long entryId;

    private String journalEntry;

    private boolean publicEntry;

    public JournalEntry() {
    }

    public Long getEntryId() {
        return entryId;
    }

    public void setEntryId(Long entryId) {
        this.entryId = entryId;
    }

    public String getJournalEntry() {
        return journalEntry;
    }

    public void setJournalEntry(String journalEntry) {
        this.journalEntry = journalEntry;
    }

    public boolean isPublicEntry() {
        return publicEntry;
    }

    public void setPublicEntry(boolean publicEntry) {
        this.publicEntry = publicEntry;
    }
}