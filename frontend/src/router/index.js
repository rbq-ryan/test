import { createRouter, createWebHistory } from 'vue-router';
import Login from '../components/Login.vue';
import BookList from '../components/BookList.vue';
import Admin from '../components/Admin.vue';

const routes = [
  { path: '/', component: BookList },
  { path: '/login', component: Login },
  { path: '/admin', component: Admin }
];

const router = createRouter({
  history: createWebHistory(),
  routes
});

export default router;
