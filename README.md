Original App Design Project - README Template
===

# Pod Paper

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
In this app, a user views a newspaper layout, in a jagged puzzle of headlines and descriptions. However, when a use clicks on an article, They will hear a podcast instead of listening to an article. 

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category: news/entertainment**
- **Mobile: for androids**
- **Story: A user can view news stories and listen ot them as podcasts**
- **Market: People who like to listen to podcasts**
- **Habit: The app is hopefully habit-forming, as people will revisit the app to see news**
- **Scope: The focus is relatively narrow, just listening to news stories**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* Implement a recycler view or a cardview that has a list of stories with their titles and descriptions. 
* When a user clicks on a story, we move to a more detailed view and the user has the option to listen to a podcast
* Integration with the spotify API allows for podcasts
* When displaying a podcast, the page is aesthetically pleasing
* Include use of the camera

**Optional Nice-to-have Stories**

* User can login and logout
* Within their account, the user can get personalized recommendations. I can use item-item collaborative filtering to do this. 
* Within a recyler view, some but not all podcasts have descriptions
* User and like and comment on podcasts

### 2. Screen Archetypes

* The app opens and the user sees a display of multiple stories.
   * Using a cardview or a recycler view, the user will be able to see a variety of news stories, inclding titles, descriptions, and headings.
* A more detailed view of a podcast
   * After clicking on a podcast, the user sees a more detailed view of that podcast, and can plya the podcast if they choose to. 
   * In this screen, the user can also like and comment on the podcast. 
   

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Homepage of news stories
* Search for a news story

**Flow Navigation** (Screen to Screen)

* Front page of a newspaper
   * Click on a story to see the details
* A more detailed page of the podcast
   * User can click start on the podcast to listen to it

## Wireframes
[Add picture of your hand sketched wireframes in this section]
<img src="YOUR_WIREFRAME_IMAGE_URL" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
