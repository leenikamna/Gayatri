@Asianpaints
Feature: Asianpaints
#01
@Successful_search_for_wallStickers
Scenario: Successful searching for wallStickers in shop
Given  user is on asianpaints homepage
When user click on shop button  
And click on wallStickers button
Then user navigate to wallStickers page
Then Display all wallStickers
#02
@Filter_selection_in_wallStickers
Scenario: Availability of filter
Given  user is on asianpaints homepage
When user click on shop button  
And click on wallStickers button
When user click on size filter
And select required size option
Then Display all wallpapers by choose size
When user click on price filter
And select required price range
Then Display all wallstickers in that price range
When user click on Discount filter
And select required discount option 
Then Display all wallstickers by selected option
When user click on collection filter
And select required collection type
Then Display all collection option
#3
@Successful_search_for_Do_it_yourself
Scenario: Successful searching for Do it yourself in shop
When user click on shop button  
And click on Do it yourself button
Then user navigate to Do it yourself page
Then Display all products
#04
@Filter_selection_in_Do_it_yourself
Scenario: Availability of filter
Given user is on Do_it_yourself page
When user click on product filter
And select required product option
Then Display all product of selected option
When user click on color filter
And select required color option
Then Display all products by selected color
When user click on surface filter
And select required surface option
Then Display all product for selected surface
When user click on size filter
And select required size option
Then Display all products by selected size
When user click on price filter
And select required price range
Then Display all products in that price range
#05
@Successful_search_for_Home_and_personal_Hygiene
Scenario: Successful searching for Home and personal Hygiene in shop
Given  user is on asianpaints homepage
When user click on shop button  
And click on Home and personal Hygiene button
Then user navigate to Home and personal Hygiene page
Then Display all products
#06
@Availability_of_filter_in_Home_and_personal_Hygiene_page
Scenario: Availability of filter
Given user is on Home and personal Hygiene page
When user click on product filter
And select required product option
Then Display all product of selected option
When user click on size filter
And select required size option
Then Display all products by selected size
When user click on price filter
And select required price range
Then Display all products in that price range
#07
@Successful_search_for_wallpapers
 Scenario: Successful searching for wallpapers in shop
Given  user is on asianpaints homepage
When user click on shop button  
And click on wallpapers button
Then user navigate to wallpaper page
Then Display all wallpapers
#08
@Filter_selection_in_wallpapers
Scenario: Availability of filter
Given user is on wallpaper page
When user click on color filter
And select required color option
Then Display all color wallpapers by option
When user click on Design style filter
And select required design style 
Then Display all design style of wallpapers by option
When user click on price filter
And select required price range
Then Display all price ranges
When user click on collection filter
And select required collection type
Then Display all collection option
#09
@check_service_availability
Scenario: check service availability
Given user selected the desired product 
When enter pincode
And click on check button 
Then Display message showing service is available 
#10
@Adding_product_to_cart 
Scenario: Adding product to cart
Given user selected the desired product 
When user select the number of quantity 
And click on add to cart
Then message showing product is added should display
Then close