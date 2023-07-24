package com.brutus.abio.views.adminorders;

import com.brutus.abio.data.entity.OrderDetailsDTO;
import com.brutus.abio.data.service.OrderDetailsDTOService;
import com.brutus.abio.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.data.VaadinSpringDataHelpers;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

@PageTitle("Admin/orders")
@Route(value = "admin/orders/:orderDetailsDTOID?/:action?(edit)", layout = MainLayout.class)
@RolesAllowed("ADMIN")
@Uses(Icon.class)
@Uses(Icon.class)
@Uses(Icon.class)
@Uses(Icon.class)
public class AdminordersView extends Composite<VerticalLayout> {

    private HorizontalLayout layoutRow = new HorizontalLayout();

    private MenuBar menuBar = new MenuBar();

    private VerticalLayout layoutColumn2 = new VerticalLayout();

    private Grid basicGrid = new Grid(OrderDetailsDTO.class);

    public AdminordersView() {
        getContent().setHeightFull();
        getContent().setWidthFull();
        layoutRow.setWidthFull();
        layoutRow.addClassName(Gap.MEDIUM);
        setMenuBarSampleData(menuBar);
        getContent().setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidthFull();
        setGridSampleData(basicGrid);
        getContent().add(layoutRow);
        layoutRow.add(menuBar);
        getContent().add(layoutColumn2);
        layoutColumn2.add(basicGrid);
    }

    private void setMenuBarSampleData(MenuBar menuBar) {
        menuBar.addItem("View");
        menuBar.addItem("Edit");
        menuBar.addItem("Share");
        menuBar.addItem("Move");
    }

    private void setGridSampleData(Grid grid) {
        grid.setItems(query -> orderDetailsDTOService.list(
                PageRequest.of(query.getPage(), query.getPageSize(), VaadinSpringDataHelpers.toSpringDataSort(query)))
                .stream());
    }

    @Autowired()
    private OrderDetailsDTOService orderDetailsDTOService;
}
