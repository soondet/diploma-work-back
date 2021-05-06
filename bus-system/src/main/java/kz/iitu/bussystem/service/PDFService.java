package kz.iitu.bussystem.service;

import kz.iitu.bussystem.entity.Route;

import java.util.Collection;

public interface PDFService {
    public abstract Collection<Route> send();
    public abstract Collection<Route> download();

}
