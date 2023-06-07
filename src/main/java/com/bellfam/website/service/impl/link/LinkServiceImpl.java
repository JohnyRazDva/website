package com.bellfam.website.service.impl.link;

import com.bellfam.website.model.Link;
import com.bellfam.website.model.Post;
import com.bellfam.website.repository.interf.link.LinkRepository;
import com.bellfam.website.service.impl.AbstractCRUDService;
import com.bellfam.website.service.interf.link.LinkService;
import com.bellfam.website.service.interf.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 * @author Eugene Petrov
 */
@Service
public class LinkServiceImpl extends AbstractCRUDService<Link, Integer> implements LinkService {

    @Autowired
    LinkRepository linkRepository;

    @Override
    protected CrudRepository<Link, Integer> getRepository() {
        return linkRepository;
    }

}