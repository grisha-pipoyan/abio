package com.brutus.abio.views.header;

import com.brutus.abio.data.entity.Header;
import com.brutus.abio.data.service.HeaderService;
import com.brutus.abio.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Header")
@Route(value = "header/:headerID?/:action?(edit)", layout = MainLayout.class)
@RolesAllowed("ADMIN")
public class HeaderView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private Grid basicGrid = new Grid(Header.class);

    private VerticalLayout layoutColumn3 = new VerticalLayout();

    private Grid multiSelectGrid = new Grid(Header.class);

    public HeaderView() {
        getContent().setWidthFull();
        getContent().addClassName(Padding.LARGE);
        layoutRow.setWidthFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth(null);
        setGridSampleData(basicGrid);
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth(null);
        multiSelectGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        setGridSampleData(multiSelectGrid);
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(basicGrid);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(multiSelectGrid);
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> headerService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private HeaderService headerService;
}
