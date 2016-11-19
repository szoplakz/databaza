package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface TagManager {

    List<Tag> getAllTag();

    void insertTag(Tag tag);

    void deleteTag(int id);

    void updateTag(int id);

}
