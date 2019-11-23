package containers;

import containers.ProductContainer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Warglaive
 */
public class ProductContainerRecorder extends ProductContainer {

    ContainerHistory Container;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.Container = new ContainerHistory();
        this.Container.add(initialVolume);
        super.addToTheContainer(initialVolume);
    }

    public String history() {
///Exercise 30.6: Product Container Recorder, Phase 1

    }
}
