{% if pageName == "MainCategory" %}
    <div class="heading main-category-heading">Top "hauptkategoriename" Produkte fur Sie</div>
{% endif%}
<div class="category-filter row desktop">
    <div class="clm">
        <ul>
            <li class="dropdown" data-position="bottom">
                <div class="dropdown-click filter-click"><i class="fa fa-angle-down"></i> Preis </div>
                <div class="dropdown-drop hide">
                    <div id="slider-range" class="preis-slider"></div>
                    <div class="preis-price">
                        <input type="text" id="amount"  readonly>
                    </div>
                    <div class="apply-filter submit button">
                        Apply Filter
                    </div>
                </div>
            </li>
            <li class="dropdown" data-position="bottom">
                <div class="dropdown-click filter-click"><i class="fa fa-angle-down"></i> Farbe </div>
                <div class="dropdown-drop hide">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="Farbe"><label for="Farbe">Farbe 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Farbe1"><label for="Farbe1">Farbe 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Farbe2"><label for="Farbe2">Farbe 3</label><br></div>
                    </form>
                    <div class="apply-filter submit button">
                        Apply Filter
                    </div>
                </div>
            </li>
            <li class="dropdown" data-position="bottom">
                <div class="dropdown-click filter-click"> <i class="fa fa-angle-down"></i> Marken</div>
                <div class="dropdown-drop hide">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="Marken"><label for="Marken">Marken 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Marken1"><label for="Marken1">Marken 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Marken2"><label for="Marken2">Marken 3</label><br></div>
                    </form>
                    <div class="apply-filter submit button">
                        Apply Filter
                    </div>
                </div>
            </li>
            <li class="dropdown" data-position="bottom">
                <div class="dropdown-click filter-click"><i class="fa fa-angle-down"></i> Kategorie</div>
                <div class="dropdown-drop hide">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="Kategorie"><label for="Kategorie">Kategorie 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Kategorie2"><label for="Kategorie2">Kategorie 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Kategorie3"><label for="Kategorie3">Kategorie 3</label><br></div>
                    </form>
                    <div class="apply-filter submit button">
                        Apply Filter
                    </div>
                </div>
            </li>
            <li class="dropdown" data-position="bottom">
                <div class="dropdown-click filter-click"><i class="fa fa-angle-down"></i> Material</div>
                <div class="dropdown-drop hide">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="Material"><label for="Material">Material 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Material2"><label for="Material2">Material 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Material3"><label for="Material3">Material 3</label><br></div>
                    </form>
                    <div class="apply-filter submit button">
                        Apply Filter
                    </div>
                </div>
            </li>
            <li class="dropdown" data-position="bottom">
                <div class="dropdown-click filter-click"><i class="fa fa-angle-down"></i> Fillialen </div>
                <div class="dropdown-drop hide">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="Fillialen"><label for="Fillialen">Fillialen 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Fillialen2"><label for="Fillialen2">Fillialen 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Fillialen3"><label for="Fillialen3">Fillialen 3</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Fillialen4"><label for="Fillialen4">Fillialen 4</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Fillialen5"><label for="Fillialen5">Fillialen 5</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Fillialen6"><label for="Fillialen6">Fillialen 6</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="Fillialen7"><label for="Fillialen7">Fillialen 7</label><br></div>
                    </form>
                    <div class="apply-filter submit button">
                        Apply Filter
                    </div>
                </div>
            </li>
            <li><span class="clear-filter">Alle Filter</span> </li>

        </ul>
    </div>
</div>
<div class="clm desktop">
    <div class="category-filter sort-block">
        <ul>
            <li class="dropdown" data-position="bottom" auto-close="true">
                <div class="dropdown-click sorting"> <i class="fa fa-angle-down"></i> Sortieren</div>
                <div class="dropdown-drop hide ">
                    <div class="list selected">Click 1</div>
                    <div class="list">Click 2</div>
                    <div class="list">Click 3</div>
                    <div class="list">Click 4</div>
                    <div class="list">Click 5</div>
                </div>
            </li>
        </ul>
    </div>
    <div class="pagination">
        <span class="page-info">
            Seite: 
        </span>
        <ul>
            <li class="jq-arrow-left" title="left"><a href="javascript:void(0)"><i class="fa fa-angle-left"></i></a></li>
            <li class="jq-pagination"><a href="javascript:void(0)">1</a></li>
            <li class="jq-pagination"><a href="javascript:void(0)">2</a></li>
            <li class="selected jq-pagination"><a href="javascript:void(0)">3</a></li>
            <li class="jq-pagination">...</li>
            <li class="jq-pagination"><a href="javascript:void(0)">8</a></li>
            <li class="jq-arrow-left" title="left"><a href="javascript:void(0)"><i class="fa fa-angle-right"></i></a></li>
        </ul>

    </div>
</div>

<div class="mobile mobile-filter clear">
    <div class="clm xs-clm6 modal" data-class="kategories-popup">
        <span>Kategorien</span>
        <i class="fa fa-angle-down"></i>
    </div>
    <div class="modal-show kategories-popup small hide">
        <div class="fa fa-close modal-close"></div>
        <div class="inner-modal">
            <div class="top-button-block">
                <div class="back jq-close-filter">
                    <!-- <i class="fa fa-close"></i> -->
                    <span>Close</span>
                </div>
                <div class="button submit small jq-close-filter">Apply Filter</div>
                <div class="button cancel small jq-close-filter">Cancel Filter</div>
            </div>
            <div class="filter-content">
                <div class="filter-blk">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="cate"><label for="cate">Category 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate1"><label for="cate1">Category 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate2"><label for="cate2">Category 3</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate3"><label for="cate3">Category 4</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate4"><label for="cate4">Category 5</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate5"><label for="cate5">Category 6</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate6"><label for="cate6">Category 7</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="cate7"><label for="cate7">Category 8</label><br></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <div class="clm xs-clm6 modal" data-class="filter-popup">
        <span>Filtern / Sortieren</span>
        <i class="fa fa-angle-down"></i>
    </div>
    <div class="modal-show filter-popup small hide">
        <div class="fa fa-close modal-close"></div>
        <div class="inner-modal">
            <div class="top-button-block">
                <div class="back jq-close-filter">
                    <!-- <i class="fa fa-close"></i> -->
                    <span>Close</span>
                </div>
                <div class="button submit small jq-close-filter">Apply Filter</div>
                <div class="button cancel small jq-close-filter">Cancel Filter</div>
            </div>
            <!--                                <div class="back-button jq-close-filter">
                                                <i class="fa fa-angle-left"></i>
                                                <span>Back</span>
                                            </div>-->
            <div class="filter-content">
                <div class="filter-hd">Preis</div>
                <div class="filter-blk">
                    <div id="slider-range-mobile" class="preis-slider"></div>
                    <div class="preis-price">
                        <input type="text" id="amount-mobile"  readonly>
                    </div>
                </div>

                <div class="filter-hd">Farbe</div>
                <div class="filter-blk">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="1Farbe"><label for="1Farbe">Farbe 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Farbe1"><label for="1Farbe1">Farbe 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Farbe2"><label for="1Farbe2">Farbe 3</label><br></div>
                    </form>
                </div>

                <div class="filter-hd">Marken</div>
                <div class="filter-blk">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="1Kategorie"><label for="1Kategorie">Kategorie 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Kategorie2"><label for="1Kategorie2">Kategorie 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Kategorie3"><label for="1Kategorie3">Kategorie 3</label><br></div>
                    </form>
                </div>

                <div class="filter-hd">Material</div>
                <div class="filter-blk">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="1Material"><label for="1Material">Material 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Material2"><label for="1Material2">Material 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Material3"><label for="1Material3">Material 3</label><br></div>
                    </form>
                </div>

                <div class="filter-hd">Fillialen</div>
                <div class="filter-blk">
                    <form class="custom-checkbox custom">
                        <div><input class="my-chk" type="checkbox" id="1Fillialen"><label for="1Fillialen">Fillialen 1</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Fillialen2"><label for="1Fillialen2">Fillialen 2</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Fillialen3"><label for="1Fillialen3">Fillialen 3</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Fillialen4"><label for="1Fillialen4">Fillialen 4</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Fillialen5"><label for="1Fillialen5">Fillialen 5</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Fillialen6"><label for="1Fillialen6">Fillialen 6</label><br></div>
                        <div><input class="my-chk" type="checkbox" id="1Fillialen7"><label for="1Fillialen7">Fillialen 7</label><br></div>
                    </form>
                </div>
            </div>
            <!--                                <div class="button-block">
                                                <div class="button submit jq-close-filter">Apply Filter</div>
                                                <div class="button cancel jq-close-filter">Cancel Filter</div>
                                            </div>-->
        </div>
    </div>
</div>

<div class="clear"></div>
<div class="product-list">
    <div class="row">
        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)" class="prd-title cur-p">W. Schillig Ecksofa Langer Name,der uber zwei Zeilen geht</a>
                <div class="product-fabric">
                    <div class="tt category-tt" >Individuell konfigurierbar</div>
                </div>
                <div class="product-selector">
                    <select class="custom-select" id="one">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)" class="prd-title cur-p">W. Schillig Ecksofa Langer Name,der uber zwei Zeilen geht</a>
                        <div class="product-selector">
                            <select class="custom-select" id="one1">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        {#<i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> #}
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="two">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                {#<i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> #}
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="two2">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    {#<div class="pos-right align-center badge badge-off">30%</div>#}
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="three">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            {#<div class="pos-right align-center badge badge-off">30%</div>#}
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="three3">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">W. Schillig Ecksofa Langer Name,der uber zwei Zeilen geht</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="four">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">W. Schillig Ecksofa Langer Name,der uber zwei Zeilen geht</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="four4">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            {#<li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>#}
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="five">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="five5">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="six">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="six6">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <a href="javascript:void(0)" class="red-bg-anchor">
            <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12 red-bg">
                <div class="container">25% Rabatt auf rote Sofas</div>
            </div>
        </a>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="seven">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="seven7">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="eight">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="eight8">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">W. Schillig Ecksofa Langer Name,der uber zwei Zeilen geht</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="nine">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">W. Schillig Ecksofa Langer Name,der uber zwei Zeilen geht</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="nine9">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>



        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12">
            <div class="prd-blk">
                <div class="mobile mobile-show-detail">
                    <i class="fa fa-angle-down"></i>
                </div>
                <div class="image-block">
                    <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                    <div class="rating">
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star"></i> 
                        <i class="fa fa-star-half-o"></i> 
                        <i class="fa fa-star-o"></i> 
                    </div>
                    <div class="pos-right align-center badge badge-off">30%</div>
                    <div class="row btn-row mobile-buttons hide">
                        <div class="clm xs-clm4">
                            <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                        </div>
                        <div class="clm xs-clm8">
                            <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                        </div>
                    </div>
                </div>
                <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                <div class="product-selector">
                    <select class="custom-select" id="ten">
                        <option value="Filiale auswahlen">Filiale auswahlen</option>
                    </select>
                    <label>Probesitzen in </label>
                </div>
                <div class="prd-prc">
                    <span class="price">ab 500,00 &euro;</span>
                    <span class="old">700,00 &euro;</span>
                </div>
                <div class="clear"></div>
                <div class="product-hover">
                    <div class="prd-hover-slider">
                        <div class="vertical-swiper">
                            <div class="swiper-wrapper">
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                                <div class="swiper-slide"> </div>
                            </div>
                            <!-- Add Pagination -->
                            <div class="swiper-button-next swiper-button-white fa fa-chevron-up"></div>
                            <div class="swiper-button-prev swiper-button-white fa fa-chevron-down"></div>
                        </div>
                    </div>
                    <div class="prd-hover-info">
                        <div class="image-block">
                            <a href="javascript:void(0)"><img class="product-image" src="http://www.homesofa.de/4621-teaser_l/paolo.jpg" /></a>
                            <div class="rating">
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star"></i> 
                                <i class="fa fa-star-half-o"></i> 
                                <i class="fa fa-star-o"></i> 
                            </div>
                            <div class="product-wishlist"><i class="fa fa-heart-o"></i></div>
                            <div class="row btn-row desktop">
                                <div class="clm xs-clm4">
                                    <a href="javascript:void(0)" class="button btn-type-1">Zur Serie</a>
                                </div>
                                <div class="clm xs-clm8">
                                    <a href="javascript:void(0)" class="button btn-type-2">Zum Produkt</a>
                                </div>
                            </div>
                            <div class="pos-right align-center badge badge-off">30%</div>
                        </div>
                        <a href="javascript:void(0)"><div class="prd-title cur-p">Schlafsofa Vienna</div></a>
                        <div class="product-selector">
                            <select class="custom-select" id="ten10">
                                <option value="Filiale auswahlen">Filiale auswahlen</option>
                            </select>
                            <label>Probesitzen in </label>
                        </div>
                        <div class="prd-prc">
                            <span class="price">ab 500,00 &euro;</span>
                            <span class="old">700,00 &euro;</span>
                        </div>
                        <div class="clear"></div>
                        <ul class="product-feature">
                            <li>hochwertige Polsterung</li>
                            <li>Schlaffunktion und Bettkasten optional</li>
                            <li>inkl, Kopfteilverstellung</li>
                        </ul>
                        <div class="product-fabric">
                            <div class="hd">Farben</div>
                            <div class="tt">Individuell konfigurierbar</div>
                        </div>
                        <ul class="choose-fabric row">
                            <li class="color-fill"></li>
                            <li class="color-fill white"></li>
                            <li class="color-fill green"></li>
                            <li class="color-fill blue"></li>
                            <li class="color-fill selected orange"></li>
                            <li class="color-fill lite-blue"></li>
                            <li class="category-filter fabric-more">
                                <div class="dropdown" data-position="bottom" auto-close="true">
                                    <div class="dropdown-click fabric-click"> <i class="fa fa-angle-down"></i></div>
                                    <ul class="dropdown-drop hide ">
                                        <li class="color-fill"></li>
                                        <li class="color-fill green"></li>
                                        <li class="color-fill blue"></li>
                                        <li class="color-fill selected orange"></li>
                                        <li class="color-fill lite-blue"></li>
                                    </ul>
                                </div>   
                            </li>
                        </ul>
                        <div class="clear"></div>
                        <div class="product-delivery">
                            Lieferbar in 8 -11 Wochen
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="clm l-clm4 m-clm6 s-clm6 xs-clm12 red-bg white-bg desktop">
            <div class="container">
                <a href="javascript:void(0)" class="inside-container">
                    <i class="fa fa-arrow-circle-right"></i>
                    <div>Weiter</div>
                </a>
            </div>
        </div>
    </div>
</div>
<div class="desktop">
    <div class="pagination">
        <span class="page-info">
            Seite: 
        </span>
        <ul>
            <li class="jq-arrow-left" title="left"><i class="fa fa-angle-left"></i></li>
            <li class="jq-pagination">1</li>
            <li class="jq-pagination">2</li>
            <li class="selected jq-pagination">3</li>
            <li class="jq-pagination">...</li>
            <li class="jq-pagination">8</li>
            <li class="jq-arrow-left" title="left"><i class="fa fa-angle-right"></i></li>
        </ul>

    </div>
</div>
<div class="clear"></div>